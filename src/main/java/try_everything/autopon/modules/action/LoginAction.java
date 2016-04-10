package try_everything.autopon.modules.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import try_everything.autopon.modules.entity.User;
import try_everything.autopon.modules.service.UserService;

public class LoginAction extends ActionSupport
{
	/**
	 * 登陆Action
	 * @author jiangnan
	 * @since 2016-04-10
	 */
	private static final long serialVersionUID = 3449260016111628106L;
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
	public String validLogin() throws Exception
	{
		if (userService.validLogin(user) > 0)
		{
			ActionContext ctx = ActionContext.getContext();
			ctx.getSession().put("username", user.getUsername());
			return SUCCESS;
		}
		return LOGIN;
	}
	
	public String logout() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("username", "");
		return "logout";
	}
	
}
