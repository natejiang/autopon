package try_everything.autopon.modules.action;

import java.util.TreeMap;

import try_everything.autopon.modules.entity.OLTInfo;
import try_everything.autopon.modules.service.OLTInfoService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OLTInfoAction extends ActionSupport {

	/**
	 * @author Jiangnan
	 * @since 2016-04-15
	 */
	private static final long serialVersionUID = 1L;
	private OLTInfo oLTInfo;
	private OLTInfoService oLTInfoService;
	public OLTInfo getoLTInfo() {
		return oLTInfo;
	}
	public void setoLTInfo(OLTInfo oLTInfo) {
		this.oLTInfo = oLTInfo;
	}
	public OLTInfoService getoLTInfoService() {
		return oLTInfoService;
	}
	public void setoLTInfoService(OLTInfoService oLTInfoService) {
		this.oLTInfoService = oLTInfoService;
	}
	
	public String add()
	{
		int result = oLTInfoService.add(oLTInfo);
		if (result > 0)
		{
			return SUCCESS;
		}
		return ERROR;
	}
	public String deleteById() throws Exception
	{
		ActionContext ctx = ActionContext.getContext();
		TreeMap<String, Object> Params =  (TreeMap<String, Object>) ctx.getParameters();
		//返回值为数组
		String[] ids = (String[]) Params.get("id");
		for (int i = 0 ;i < ids.length ;i ++)
		{
			oLTInfoService.deleteById(Integer.parseInt(ids[0]));
		}		
		return "delete_success";			
	}
	public String findAllOrderById()
	{
		return null;
	}
	public String findAllByPageOrderById()
	{
		return null;
	
	}
	

}
