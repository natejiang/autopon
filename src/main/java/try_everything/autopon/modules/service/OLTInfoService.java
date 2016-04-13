package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.entity.OLTInfo;


public interface OLTInfoService {
	/**
	 * @author Jiangnan
	 * @since 2016-04-06
	 */
	int addOLTInfo(OLTInfo oLTInfo);
	List<OLTInfo> findAllOrderByDate(Class<OLTInfo> userClazz);
	List<OLTInfo> findByPageOrderByDate(Class<OLTInfo> userClazz,int pageNo,int pageSize);
	boolean deleteById(Integer id) throws Exception;
}
