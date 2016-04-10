package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.dao.UserDao;
import try_everything.autopon.modules.entity.User;

public class UserServiceImpl implements UserService {
	private UserDao userDao;
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public UserDao getUserDao() {
		return userDao;
	}

	@Override
	public int addUser(User user) {
		try
		{
			return (Integer) userDao.save(user);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}		
		finally{}
	}

	@Override
	public List<User> findAllOrderByDate(Class<User> userClazz) {
		try
		{
			return (List<User>)userDao.findAllOrderByDate(userClazz);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally{}
	}

	@Override
	public List<User> findByPageOrderByDate(Class<User> userClazz, int pageNo,
			int pageSize) {
		try
		{
			return (List<User>)userDao.findByPageOrderByDate(userClazz,pageNo,pageSize);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally{}	
	}

	@Override
	public boolean deleteById(Integer id) throws Exception {
		try
		{
			userDao.delete(User.class,id);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}	
		finally{}
	}

	@Override
	public int validLogin(User user) {
		List<User> list = userDao.findByUsernameAndPassord(user);
		if( list.size() > 0)
		{
			return 1;
		}
		return 0;
	}
}
