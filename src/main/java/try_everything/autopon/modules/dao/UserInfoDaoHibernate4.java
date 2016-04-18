package try_everything.autopon.modules.dao;

import java.util.List;

import try_everything.autopon.common.persistence.BaseDaoHibernate4;
import try_everything.autopon.modules.entity.UserInfo;

public class UserInfoDaoHibernate4  extends BaseDaoHibernate4<UserInfo> implements UserInfoDao{
	/**
	 * @author Jiangnan
	 * @date 2016-03-18
	 */

	@Override
	public List<UserInfo> findAllOrderByDate(Class<UserInfo> entityClazz) {
		return find("select en from " + entityClazz.getSimpleName() + " en" + " order by en.date desc,en.time desc");
	}

	@Override
	public List<UserInfo> findByPageOrderByDate(Class<UserInfo> entityClazz,
			int pageNo, int pageSize) {
		String hql = "select en from " + entityClazz.getSimpleName() + " en" + " order by en.date desc,en.time desc";
		return findByPage(hql,pageNo,pageSize);	
	}

	@Override
	public List<UserInfo> findByUsernameAndPassord(Class<UserInfo> entityClazz,String username,String password) {
		String hql = "select en from " + entityClazz.getSimpleName() + " en" + " where en.username = ? and en.password = ?"; 
		return find(hql,username,password);
	}


}
