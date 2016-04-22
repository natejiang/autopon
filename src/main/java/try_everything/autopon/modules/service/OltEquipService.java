package try_everything.autopon.modules.service;

import java.util.List;

import try_everything.autopon.modules.entity.OltInfo;

public interface OltEquipService<T> {
	public List<T> getOnuList(OltInfo oltInfo);
	public void addOnu();
}
