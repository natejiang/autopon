package try_everything.autopon.modules.dao;

import java.util.List;

import try_everything.autopon.common.persistence.BaseDao;
import try_everything.autopon.modules.entity.User;

public interface UserDao extends BaseDao<User> {
	/**
	 * @author Jiangnan
	 * @date 2016-03-17
	 */
	//获取所有实体按日期和时间排序
	List<User> findAllOrderByDate(Class<User> entityClazz);	
	//分页获取实体按日期和时间排序
	List<User> findByPageOrderByDate(Class<User> entityClazz,int pageNo,int pageSize);
	
	List<User> findByUsernameAndPassord(User user);
}
