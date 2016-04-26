package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.entity.OltInfo;
import try_everything.autopon.modules.entity.OnuInfo;

public interface OltEquipService<T> {
	public List<T> findAllNotConfigured(OltInfo oltInfo);
	public void add(OnuInfo onuInfo);
}
