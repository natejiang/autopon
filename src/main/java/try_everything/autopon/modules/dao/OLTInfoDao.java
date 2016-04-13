package try_everything.autopon.modules.dao;


import java.util.List;

import try_everything.autopon.common.persistence.BaseDao;
import try_everything.autopon.modules.entity.OLTInfo;

public interface OLTInfoDao extends BaseDao<OLTInfo>{
	/**
	 * @author Jiangnan
	 * @date 2016-04-12
	 */
	//��ȡ����ʵ�尴���ں�ʱ������
	List<OLTInfo> findAllOrderByDate(Class<OLTInfo> entityClazz);	
	//��ҳ��ȡʵ�尴���ں�ʱ������
	List<OLTInfo> findByPageOrderByDate(Class<OLTInfo> entityClazz,int pageNo,int pageSize);
}
