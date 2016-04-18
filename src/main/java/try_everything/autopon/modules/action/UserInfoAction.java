package try_everything.autopon.modules.action;

import com.opensymphony.xwork2.ActionSupport;

import try_everything.autopon.modules.entity.UserInfo;
import try_everything.autopon.modules.service.UserInfoService;

public class UserInfoAction extends ActionSupport{
	/**
	 * 注册用户Action
	 * @author jiangnan
	 * @since 2016-04-10
	 */
	private static final long serialVersionUID = 1L;
	private UserInfo userInfo;
	private UserInfoService userInfoService;

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public UserInfoService getUserInfoService() {
		return userInfoService;
	}

	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	public String addUser()
	{
		int result = userInfoService.addUser(userInfo);
		if (result > 0)
		{
			return SUCCESS;
		}
		return ERROR;
	}
	
}
