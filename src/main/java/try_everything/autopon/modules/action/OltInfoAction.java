package try_everything.autopon.modules.action;

import java.util.List;

import try_everything.autopon.modules.entity.OltInfo;
import try_everything.autopon.modules.service.OltInfoService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class OltInfoAction extends ActionSupport {

	/**
	 * @author Jiangnan
	 * @since 2016-04-15
	 */
	private static final long serialVersionUID = 1L;
	private OltInfo oltInfo;
	private OltInfoService oltInfoService;
	private int pageNo;
	
	
	public OltInfo getOltInfo() {
		return oltInfo;
	}
	public void setOltInfo(OltInfo oltInfo) {
		this.oltInfo = oltInfo;
	}
	public OltInfoService getOltInfoService() {
		return oltInfoService;
	}
	public void setOltInfoService(OltInfoService oltInfoService) {
		this.oltInfoService = oltInfoService;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public String add()
	{
		int result = oltInfoService.add(oltInfo);
		if (result > 0)
		{
			return SUCCESS;
		}
		return ERROR;
	}
	public String deleteById() throws Exception
	{		
		boolean result =  oltInfoService.deleteById(oltInfo.getId());
		if(result == true)
		{
			return "delete_success";
		}
		return ERROR;
	}
	public String findAllOrderById()
	{
		List<OltInfo> list = oltInfoService.findAllOrderById(OltInfo.class);
		ActionContext actionContext = ActionContext.getContext();
		if (list != null && list.size() > 0)
		{
			actionContext.getParameters().put("oLTinfo", list);
			actionContext.getParameters().put("size",list.size());
			return SUCCESS;
		}else
		{
			return ERROR;
		}		
	}
	public String findAllByPageOrderById()
	{
		List<OltInfo> list = oltInfoService.findByPageOrderById(OltInfo.class, pageNo, 10);
		ActionContext actionContext = ActionContext.getContext();
		if (list != null && list.size() > 0)
		{
			actionContext.getParameters().put("oLTinfo", list);
			actionContext.getParameters().put("size",list.size());
			return SUCCESS;
		}else
		{
			return ERROR;
		}
	}
	

}
