package try_everything.autopon.modules.service;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.List;

import org.apache.commons.net.telnet.TelnetClient;

import try_everything.autopon.modules.entity.OltInfo;
import try_everything.autopon.modules.entity.OnuInfo;

public class OltEquipServiceZte implements OltEquipService<OnuInfo>{
	/**
	 * Huawei Olt
	 * @author Jiangnan
	 * @since 2016-04-20
	 */
	private OltInfo oltInfo;
	private String prompt = "#";              //结束标志字符
	
	public void setOltInfo(OltInfo oltInfo) {
		this.oltInfo = oltInfo;
	}

	@Override
	public void login() {
		try 
        {	
			TelnetClient telnetClient = new TelnetClient(); 
        	telnetClient.connect(oltInfo.getIpaddress(), 23);  
            InputStream in = telnetClient.getInputStream();  
            OutputStream out = new PrintStream(telnetClient.getOutputStream());  
            System.out.println(readUntil("Username:")); 
            write(username);  
            System.out.println(readUntil("Password:"));  
            write(password);  
            String resultStr = readUntil(prompt); 
            System.out.println(resultStr);
            if(resultStr!=null&&resultStr.contains("No username or bad password")){  
                throw new RuntimeException("登陆失败");  
            }  
        }catch (RuntimeException e){
        	System.out.println("登陆失败");
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
		
		
	}

	@Override
	public List<OnuInfo> getOnuList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addOnu() {
		// TODO Auto-generated method stub
		
	}

}
