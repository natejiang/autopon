package try_everything.autopon.modules.dao;

import java.util.List;

import try_everything.autopon.common.persistence.BaseDao;
import try_everything.autopon.modules.entity.UserInfo;

public interface UserInfoDao extends BaseDao<UserInfo> {
	/**
	 * @author Jiangnan
	 * @date 2016-03-17
	 */
	//获取所有实体按日期和时间排序
	List<UserInfo> findAllOrderByDate(Class<UserInfo> entityClazz);	
	//分页获取实体按日期和时间排序
	List<UserInfo> findByPageOrderByDate(Class<UserInfo> entityClazz,int pageNo,int pageSize);
	
	List<UserInfo> findByUsernameAndPassord(Class<UserInfo> entityClazz,String username,String password);
}
