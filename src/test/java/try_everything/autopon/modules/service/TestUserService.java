package try_everything.autopon.modules.service;


import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import try_everything.autopon.modules.entity.User;

public class TestUserService {
	/**
	 * @author Jiangnan
	 * @since 2016-04-11
	 */

	ApplicationContext ctx = null;  
	UserService userService = null;  
	
	@Before  
	public void beforeClass() {  
	    ctx = new FileSystemXmlApplicationContext(  
	            "classpath*:applicationContext.xml");  
	    userService = (UserService) ctx.getBean("userService");  
	}  
	@Test
	public void testValidLogin() {
		
		User user = new User();  
	    user.setUsername("jiangnan");
	    user.setPassword("123");   
		System.out.println("是不否为真" + userService.validLogin(user));    
			   

	}	
}
