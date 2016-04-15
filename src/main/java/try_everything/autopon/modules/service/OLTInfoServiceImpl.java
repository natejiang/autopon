package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.dao.OLTInfoDao;
import try_everything.autopon.modules.entity.OLTInfo;

public class OLTInfoServiceImpl implements OLTInfoService{
	/**
	 * @author Jiangnan
	 * @since 2016-04-15
	 */
	private OLTInfoDao oLTInfoDao;
	
	public OLTInfoDao getoLTInfoDao() {
		return oLTInfoDao;
	}

	public void setoLTInfoDao(OLTInfoDao oLTInfoDao) {
		this.oLTInfoDao = oLTInfoDao;
	}

	@Override
	public int add(OLTInfo oLTInfo) {
		try
		{
			return (Integer) oLTInfoDao.save(oLTInfo);
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
			oLTInfoDao.delete(OLTInfo.class,id);
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
	public List<OLTInfo> findAllOrderById(Class<OLTInfo> oLTInfoClazz) {
		try
		{
			return (List<OLTInfo>)oLTInfoDao.findAllOrderById(oLTInfoClazz);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally{}
	}

	@Override
	public List<OLTInfo> findByPageOrderById(Class<OLTInfo> oLTInfoClazz,
			int pageNo, int pageSize) {
		try
		{
			return (List<OLTInfo>)oLTInfoDao.findByPageOrderById(oLTInfoClazz,pageNo,pageSize);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally{}
	}



}
