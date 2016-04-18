package try_everything.autopon.modules.dao;


import java.util.List;

import try_everything.autopon.common.persistence.BaseDao;
import try_everything.autopon.modules.entity.OltInfo;

public interface OltInfoDao extends BaseDao<OltInfo>{
	/**
	 * @author Jiangnan
	 * @date 2016-04-15
	 */
	//获取所有实体按日期和时间排序
	List<OltInfo> findAllOrderById(Class<OltInfo> entityClazz);	
	//分页获取实体按日期和时间排序
	List<OltInfo> findByPageOrderById(Class<OltInfo> entityClazz,int pageNo,int pageSize);
	
}
