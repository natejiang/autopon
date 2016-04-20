package try_everything.autopon.modules.dao;

import java.util.List;

import try_everything.autopon.common.persistence.BaseDaoHibernate4;
import try_everything.autopon.modules.entity.OltInfo;

public class OltInfoDaoHibernate4 extends BaseDaoHibernate4<OltInfo> 
	implements OltInfoDao{
	/**
	 * @author Jiangnan
	 * @since 2016-04-12
	 */

	@Override
	public List<OltInfo> findAllOrderById(Class<OltInfo> entityClazz) {
		return find("select en from " + entityClazz.getSimpleName() + " en" + " order by en.id desc");
	}
	
	@Override
	public List<OltInfo> findByPageOrderById(Class<OltInfo> entityClazz,
			int pageNo, int pageSize) {
		String hql = "select en from " + entityClazz.getSimpleName() + " en" + " order by en.id desc";
		return findByPage(hql,pageNo,pageSize);	
	}
	
}
