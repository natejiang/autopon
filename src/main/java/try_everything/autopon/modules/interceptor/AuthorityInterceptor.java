package try_everything.autopon.modules.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class AuthorityInterceptor extends AbstractInterceptor {
	/**
	 * 权限拦截器
	 * @author jiangnan
	 * @since 2016-4-10
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext ctx = invocation.getInvocationContext();
		Map<String, Object> session = ctx.getSession();
		String username = (String)session.get("username");
		if (username != null)
		{
			return invocation.invoke();
		}
		return Action.LOGIN;
	}
}
