package try_everything.autopon.modules.entity;

	/**
	 * @author jiangnan
	 * @since 2016-04-23
	 */
public class OnuInfo {

	private OltInfo oltInfo;
	private String onuInterface;
	private String onuSn;
	private String onuVlan;
	
	public OltInfo getOltInfo() {
		return oltInfo;
	}
	public void setOltInfo(OltInfo oltInfo) {
		this.oltInfo = oltInfo;
	}
	public String getOnuInterface() {
		return onuInterface;
	}
	public void setOnuInterface(String onuInterface) {
		this.onuInterface = onuInterface;
	}
	public String getOnuSn() {
		return onuSn;
	}
	public void setOnuSn(String onuSn) {
		this.onuSn = onuSn;
	}
	public String getOnuVlan() {
		return onuVlan;
	}
	public void setOnuVlan(String onuVlan) {
		this.onuVlan = onuVlan;
	}
	

}
