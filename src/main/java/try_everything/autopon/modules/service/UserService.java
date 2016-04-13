package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.entity.User;

public interface UserService  {
	/**
	 * @author Jiangnan
	 * @since 2016-04-06
	 */
	int addUser(User user);
	List<User> findAllOrderByDate(Class<User> userClazz);
	List<User> findByPageOrderByDate(Class<User> userClazz,int pageNo,int pageSize);
	boolean deleteById(Integer id) throws Exception;
	public int validLogin(User user);
}
