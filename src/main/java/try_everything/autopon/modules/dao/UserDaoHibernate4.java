package try_everything.autopon.modules.dao;

import java.util.List;

import try_everything.autopon.common.persistence.BaseDaoHibernate4;
import try_everything.autopon.modules.entity.User;

public class UserDaoHibernate4  extends BaseDaoHibernate4<User> implements UserDao{
	/**
	 * @author Jiangnan
	 * @date 2016-03-18
	 */

	@Override
	public List<User> findAllOrderByDate(Class<User> entityClazz) {
		return find("select en from " + entityClazz.getSimpleName() + " en" + " order by en.date desc,en.time desc");
	}

	@Override
	public List<User> findByPageOrderByDate(Class<User> entityClazz,
			int pageNo, int pageSize) {
		String hql = "select en from " + entityClazz.getSimpleName() + " en" + " order by en.date desc,en.time desc";
		return findByPage(hql,pageNo,pageSize);	
	}

	@Override
	public List<User> findByUsernameAndPassord(Class<User> entityClazz,String username,String password) {
		String hql = "select en from " + entityClazz.getSimpleName() + " en" + " where en.username = ? and en.password = ?"; 
		return find(hql,username,password);
	}


}
