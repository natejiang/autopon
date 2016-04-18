package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.dao.OltInfoDao;
import try_everything.autopon.modules.entity.OltInfo;

public class OltInfoServiceImpl implements OltInfoService{
	/**
	 * @author Jiangnan
	 * @since 2016-04-15
	 */
	private OltInfoDao oltInfoDao;
	
	public OltInfoDao getOltInfoDao() {
		return oltInfoDao;
	}

	public void setOltInfoDao(OltInfoDao oltInfoDao) {
		this.oltInfoDao = oltInfoDao;
	}

	@Override
	public int add(OltInfo oltInfo) {
		try
		{
			return (Integer) oltInfoDao.save(oltInfo);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return 0;
		}		
		finally{}
	}
	
	@Override
	public boolean deleteById(Integer id) throws Exception {
		try
		{
			oltInfoDao.delete(OltInfo.class,id);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}	
		finally{}
	}

	@Override
	public List<OltInfo> findAllOrderById(Class<OltInfo> oltInfoClazz) {
		try
		{
			return (List<OltInfo>)oltInfoDao.findAllOrderById(oltInfoClazz);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally{}
	}

	@Override
	public List<OltInfo> findByPageOrderById(Class<OltInfo> oltInfoClazz,
			int pageNo, int pageSize) {
		try
		{
			return (List<OltInfo>)oltInfoDao.findByPageOrderById(oltInfoClazz,pageNo,pageSize);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally{}
	}



}
