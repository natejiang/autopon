package try_everything.autopon.modules.action;

import com.opensymphony.xwork2.ActionSupport;

import try_everything.autopon.modules.entity.User;
import try_everything.autopon.modules.service.UserService;

public class UserInfoAction extends ActionSupport{
	/**
	 * 注册用户Action
	 * @author jiangnan
	 * @since 2016-04-10
	 */
	private static final long serialVersionUID = 1L;
	private User user;
	private UserService userService;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String addUser()
	{
		int result = userService.addUser(user);
		if (result > 0)
		{
			return SUCCESS;
		}
		return ERROR;
	}
	
}
