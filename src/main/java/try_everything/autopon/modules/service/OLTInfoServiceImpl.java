package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.dao.OLTInfoDao;
import try_everything.autopon.modules.entity.OLTInfo;

public class OLTInfoServiceImpl implements OLTInfoService{
	/**
	 * @author Jiangnan
	 * @since 2016-04-06
	 */
	private OLTInfoDao oLTInfoDao;
	
	public OLTInfoDao getoLTInfoDao() {
		return oLTInfoDao;
	}

	public void setoLTInfoDao(OLTInfoDao oLTInfoDao) {
		this.oLTInfoDao = oLTInfoDao;
	}

	@Override
	public int addOLTInfo(OLTInfo oLTInfo) {
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
	public List<OLTInfo> findAllOrderByDate(Class<OLTInfo> oLTInfoClazz) {
		try
		{
			return (List<OLTInfo>)oLTInfoDao.findAllOrderByDate(oLTInfoClazz);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
		}
		finally{}
	}

	@Override
	public List<OLTInfo> findByPageOrderByDate(Class<OLTInfo> oLTInfoClazz,
			int pageNo, int pageSize) {
		try
		{
			return (List<OLTInfo>)oLTInfoDao.findByPageOrderByDate(oLTInfoClazz,pageNo,pageSize);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return null;
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


}
