package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.entity.UserInfo;

public interface UserInfoService  {
	/**
	 * @author Jiangnan
	 * @since 2016-04-06
	 */
	int addUser(UserInfo user);
	List<UserInfo> findAllOrderByDate(Class<UserInfo> userClazz);
	List<UserInfo> findByPageOrderByDate(Class<UserInfo> userClazz,int pageNo,int pageSize);
	boolean deleteById(Integer id) throws Exception;
	public int validLogin(UserInfo user);
}
