package try_everything.autopon.modules.service;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import try_everything.autopon.common.utils.StringUtils;
import try_everything.autopon.modules.entity.OltInfo;
import try_everything.autopon.modules.entity.OnuInfo;
import try_everything.autopon.modules.utils.OltTelnetUtils;

/**
 * ZTE OLT service实现类
 * @author Jiangnan
 * @since 2016-04-26
 */

public class OltEquipServiceZte implements OltEquipService<OnuInfo>{

	private OltTelnetUtils oltTelnetUtils;
	
	public OltTelnetUtils getOltTelnetUtils() {
		return oltTelnetUtils;
	}

	public void setOltTelnetUtils(OltTelnetUtils oltTelnetUtils) {
		this.oltTelnetUtils = oltTelnetUtils;
	}

	/**
	 * 获取OLT中未配置ONU列表
	 * @param oltInfo 
	 */
	@Override
	public List<OnuInfo> findAllNotConfigured(OltInfo oltInfo) {
		List<OnuInfo> onuList = new ArrayList<OnuInfo>(); 
		List<Integer> vlanIdList = oltInfo.getVlanIdList();
		oltTelnetUtils.setOltInfo(oltInfo);
		oltTelnetUtils.login();		
		String resultStr = oltTelnetUtils.sendCommand("show gpon onu uncfg","#");
		Pattern p1 = Pattern.compile("\\d/\\d/\\d");                        //正则表达式匹配interface
    	Matcher m1 = p1.matcher(resultStr);
    	Pattern p2 = Pattern.compile("ZTE\\w{9}");                          //正则表达式匹配ONT序列号
    	Matcher m2 = p2.matcher(resultStr);
    	while(m1.find() && m2.find())
    	{
    		/**
    		 * 通过正则表达式从返回字符串中解析出相关数据
    		 * 并注入OnuInfo
    		 */
    		String[] cardInfo = m1.group().split("/");
    		int cardid = Integer.parseInt(cardInfo[1]);
    		int vlan = vlanIdList.get(cardid-2);  //OLT业务板起始于2号板    	      		
    		OnuInfo onuInfo = new OnuInfo();    		
    		onuInfo.setOltInfo(oltInfo);
    		onuInfo.setOnuInterface(m1.group());
    		onuInfo.setOnuSn(m2.group());
    		onuInfo.setOnuVlan(Integer.toString(vlan));
    		onuList.add(onuInfo);
    	}
    	oltTelnetUtils.distinct();
				
		return onuList;
	}

	@Override
	public void add(OnuInfo onuInfo) {
		oltTelnetUtils.setOltInfo(onuInfo.getOltInfo());
		oltTelnetUtils.login();	
		oltTelnetUtils.sendCommand("configure terminal","#");
		StringBuffer resultStrb = new StringBuffer();
		String resultStr =  oltTelnetUtils.sendCommand("show running-config interface gpon-olt_"
				+ onuInfo.getOnuInterface(),"--More--"); 	
	    resultStrb.append(resultStr);
	    while(resultStr.endsWith("--More--"))     //嵌套递归方法解决分屏问题
	    {        	
	    	resultStr = oltTelnetUtils.sendCommand(" ", "--More--");
	        resultStrb.append(resultStr);	        	
	    }
	    
	    int id = StringUtils.searchMAX(resultStrb.toString(),"onu");	//id属于变化参数，所以要在配置前临时获取。		
	    FileInputStream fr;
		try {
			fr = new FileInputStream("d:/zte_script.txt");
			InputStreamReader reader = new InputStreamReader(fr);
	    	BufferedReader br = new BufferedReader(reader);
	    	String buffer;
	    	while ((buffer = br.readLine()) != null)
	    	{
	    		String bufferAfter = buffer.replaceAll("%interface%", onuInfo.getOnuInterface()).replaceAll("%sn%",onuInfo.getOnuSn())
	    				.replaceAll("%id%", Integer.toString(id+1)).replaceAll("%vlan%", onuInfo.getOnuVlan());
	    		System.out.println(bufferAfter);
	    		oltTelnetUtils.sendCommand(bufferAfter,"#");
	    	}  
	    	br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    	oltTelnetUtils.distinct();	    	    
	}

}
