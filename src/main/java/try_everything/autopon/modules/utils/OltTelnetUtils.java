package try_everything.autopon.modules.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Properties;

import org.apache.commons.net.telnet.TelnetClient;

import try_everything.autopon.modules.entity.OltInfo;

public class OltTelnetUtils
{
	/**
	 * Telnet工具类
	 * @author Jiangnan
	 * @since 2016-04-23
	 */
	private OltInfo oltInfo;
	private String prompt; 
	private char promptChar;              //结束标志字符
	private String errorLoginFeedback;  //登陆错误反馈
    private TelnetClient telnet;  
    private InputStream in;     
    private PrintStream out;   
    
    /** 
     * 带参数构造器
     * @param termtype  协议类型：VT100、VT52、VT220、VTNT、ANSI I 
     */   
      
    public OltTelnetUtils(String termtype){  
        telnet = new TelnetClient(termtype);  
    }  
      
    public OltTelnetUtils(){  
        telnet = new TelnetClient();  
    }  
    
	/** 
     * 注入OltInfo,并初始化参数
     * 通过OltInfo的Model信息自动选择配置文件
     */
    
    public void setOltInfo(OltInfo oltInfo) {
		this.oltInfo = oltInfo;
		Properties props = new Properties();
		String paramFile = "OltTelnetUtils_params_" + oltInfo.getModel() + ".properties";
   		try {
			props.load(new FileInputStream(paramFile));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("目标文件不存在");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("文件无法读取");
		}   
   		prompt = props.getProperty("prompt");
   		promptChar = prompt.charAt(prompt.length() - 1); 
   		errorLoginFeedback = props.getProperty("error_login");
	}

    /** 
     * 登录到目标主机
     * @param ip 
     * @param port 
     * @param username 
     * @param password 
     */     
    public void login(){  
        try 
        {	
        	telnet.connect(oltInfo.getIpaddress(), 23);  
            in = telnet.getInputStream();  
            out = new PrintStream(telnet.getOutputStream());  
            System.out.println(readUntil("Username:")); 
            write(oltInfo.getLoginname());  
            System.out.println(readUntil("Password:"));  
            write(oltInfo.getPassword());  
            String resultStr = readUntil(prompt); 
            System.out.println(resultStr);
            if(resultStr!=null&&resultStr.contains(errorLoginFeedback)){  
                throw new RuntimeException("登陆失败");  
            }  
        }catch (RuntimeException e){
        	System.out.println("登陆失败");
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    }   
    
    public String readUntil(String pattern) {  
        StringBuffer sb = new StringBuffer();  
        try {  
            	char lastChar = (char)-1;  
            	boolean flag = pattern!=null&&pattern.length()>0;  
            	if(flag)  
            		lastChar = pattern.charAt(pattern.length() - 1);  //字符串最后一个字符
            	char ch;  
            	int code = -1;  
            	while ((code = in.read()) != -1) {  
            		ch = (char)code;  
            		sb.append(ch);  
            		//匹配到结束标识时返回结果  
                    if (flag) 
                    {  
                        if (ch == lastChar && sb.toString().endsWith(pattern)) {  
                            return sb.toString();  
                        }  
                    }
                    else
                    {  
                    	//如果没指定结束标识,匹配到默认结束标识字符时返回结果
                        if(ch == promptChar)  
                            return sb.toString();  
                    }  
                    if(ch == promptChar)  
                    { 
                    	return sb.toString();  
                    }
                    //登录失败时返回结果  
                    if(sb.toString().contains("Login Failed")){  
                        return sb.toString();  
                    }              
                 }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        return sb.toString();  
    }  

    public void write(String value) 
    {  
        try {      	
            out.println(value);  
            out.flush();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
    } 
    
    public String sendCommand(String command,String myprompt) 
    {  
    	String rs = null;
        try {  
            write(command); 
            rs = readUntil(myprompt);  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
        System.out.println(rs);
        return rs;  
    }  
    
    public void distinct(){  
        try {  
            if(telnet!=null&&!telnet.isConnected())  
                telnet.disconnect();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }    
     
}
