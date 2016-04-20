package try_everything.autopon.modules.service;

import java.util.List;

public interface OltEquipService<T> {
	public void login();
	public List<T> getOnuList();
	public void addOnu();
}
