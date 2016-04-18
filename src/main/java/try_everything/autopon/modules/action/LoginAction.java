package try_everything.autopon.modules.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import try_everything.autopon.modules.entity.UserInfo;
import try_everything.autopon.modules.service.UserInfoService;

public class LoginAction extends ActionSupport
{
	/**
	 * 登陆Action
	 * @author jiangnan
	 * @since 2016-04-10
	 */
	private static final long serialVersionUID = 3449260016111628106L;
	private UserInfo user;
	private UserInfoService userInfoService;


	public UserInfo getUser() {
		return user;
	}

	public void setUser(UserInfo user) {
		this.user = user;
	}

	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public String validLogin() throws Exception
	{
		if (userInfoService.validLogin(user) > 0)
		{
			ActionContext ctx = ActionContext.getContext();
			ctx.getSession().put("username", user.getUsername());
			return SUCCESS;
		}
		else
		{
			return ERROR;
		}
		
	}
	
	public String logout() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		ctx.getSession().put("username", "");
		return "logout";
	}
	
}
