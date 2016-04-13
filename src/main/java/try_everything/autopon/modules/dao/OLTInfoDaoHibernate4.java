package try_everything.autopon.modules.dao;

import java.util.List;

import try_everything.autopon.common.persistence.BaseDaoHibernate4;
import try_everything.autopon.modules.entity.OLTInfo;

public class OLTInfoDaoHibernate4 extends BaseDaoHibernate4<OLTInfo> 
	implements OLTInfoDao{
	/**
	 * @author Jiangnan
	 * @since 2016-04-12
	 */

	@Override
	public List<OLTInfo> findAllOrderByDate(Class<OLTInfo> entityClazz) {
		return find("select en from " + entityClazz.getSimpleName() + " en" + " order by en.date desc,en.time desc");
	}
	
	@Override
	public List<OLTInfo> findByPageOrderByDate(Class<OLTInfo> entityClazz,
			int pageNo, int pageSize) {
		String hql = "select en from " + entityClazz.getSimpleName() + " en" + " order by en.date desc,en.time desc";
		return findByPage(hql,pageNo,pageSize);	
	}
	
}
