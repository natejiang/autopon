package try_everything.autopon.modules.service;

import try_everything.autopon.modules.dao.OLTInfoDao;
import try_everything.autopon.modules.entity.OLTInfo;

public class OLTInfoServiceImpl implements OLTInfoService{
	/**
	 * @author Jiangnan
	 * @since 2016-04-06
	 */
	private OLTInfoDao oLTInfoDao;
	
	public void setOLTInfoDao(OLTInfoDao oLTInfoDao) {
		this.oLTInfoDao = oLTInfoDao;
	}
	@Override
	public int addOLTInfo(OLTInfo oLTInfo){
		return (Integer)oLTInfoDao.save(oLTInfo);
	}

}
