package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.entity.OLTInfo;


public interface OLTInfoService {
	/**
	 * @author Jiangnan
	 * @since 2016-04-06
	 */
	int add(OLTInfo oLTInfo);
	List<OLTInfo> findAllOrderById(Class<OLTInfo> userClazz);
	List<OLTInfo> findByPageOrderById(Class<OLTInfo> userClazz,int pageNo,int pageSize);
	boolean deleteById(Integer id) throws Exception;
}
