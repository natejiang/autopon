package try_everything.autopon.modules.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import try_everything.autopon.modules.entity.OltInfo;
import try_everything.autopon.modules.entity.OnuInfo;
import try_everything.autopon.modules.utils.OltTelnetUtils;

/**
 * ZTE OLT service实现类
 * @author Jiangnan
 * @since 2016-04-23
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
	public List<OnuInfo> getOnuList(OltInfo oltInfo) {
		List<OnuInfo> onuList = new ArrayList<OnuInfo>(); 
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
    		 * 获取vlan采用约定方式，server_info.txt文件中vlan排列顺序为板位排列顺序。
    		 */
    		String[] cardidArr = m1.group().split("/");
    		int cardid = Integer.parseInt(cardidArr[1]);
    		String vlan = vlanArr[cardid-2];   //OLT业务板起始于2号板
    	      		
    		HashMap<String, String> onuHas = new HashMap<String, String>();
    		onuHas.put("onuinterface",m1.group());
    		onuHas.put("sn", m2.group());
    		onuHas.put("ip", ip);
    		onuHas.put("vlan", vlan);
    		onuArr.add(onuHas);
    	}
    	to.distinct();
		
		
		return null;
	}

	@Override
	public void addOnu() {
		// TODO Auto-generated method stub
		
	}

}
