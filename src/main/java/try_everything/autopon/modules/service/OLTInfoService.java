package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.entity.OltInfo;


public interface OltInfoService {
	/**
	 * @author Jiangnan
	 * @since 2016-04-06
	 */
	int add(OltInfo oltInfo);
	List<OltInfo> findAllOrderById(Class<OltInfo> oLTInfoClazz);
	List<OltInfo> findByPageOrderById(Class<OltInfo> oltInfoClazz,int pageNo,int pageSize);
	boolean deleteById(Integer id) throws Exception;
}
