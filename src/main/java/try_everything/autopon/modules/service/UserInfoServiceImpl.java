package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.dao.UserInfoDao;
import try_everything.autopon.modules.entity.UserInfo;

public class UserInfoServiceImpl implements UserInfoService {
	private UserInfoDao userInfoDao;
	

	public UserInfoDao getUserInfoDao() {
		return userInfoDao;
	}

	public void setUserInfoDao(UserInfoDao userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	@Override
	public int addUser(UserInfo user) {
		try
		{
			return (Integer) userInfoDao.save(user);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}		
		finally{}
	}

	@Override
	public List<UserInfo> findAllOrderByDate(Class<UserInfo> userClazz) {
		try
		{
			return (List<UserInfo>)userInfoDao.findAllOrderByDate(userClazz);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally{}
	}

	@Override
	public List<UserInfo> findByPageOrderByDate(Class<UserInfo> userClazz, int pageNo,
			int pageSize) {
		try
		{
			return (List<UserInfo>)userInfoDao.findByPageOrderByDate(userClazz,pageNo,pageSize);
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
			userInfoDao.delete(UserInfo.class,id);
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
	public int validLogin(UserInfo user) {
		List<UserInfo> list = userInfoDao.findByUsernameAndPassord(UserInfo.class,user.getUsername(),user.getPassword());
		if( list.size() > 0)
		{
			return 1;
		}
		return 0;
	}
}
