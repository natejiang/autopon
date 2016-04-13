package try_everything.autopon.modules.dao;


import java.util.List;

import try_everything.autopon.common.persistence.BaseDao;
import try_everything.autopon.modules.entity.OLTInfo;

public interface OLTInfoDao extends BaseDao<OLTInfo>{
	/**
	 * @author Jiangnan
	 * @date 2016-04-12
	 */
	//获取所有实体按日期和时间排序
	List<OLTInfo> findAllOrderByDate(Class<OLTInfo> entityClazz);	
	//分页获取实体按日期和时间排序
	List<OLTInfo> findByPageOrderByDate(Class<OLTInfo> entityClazz,int pageNo,int pageSize);
}
