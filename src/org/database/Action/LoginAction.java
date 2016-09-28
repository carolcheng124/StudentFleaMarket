package org.database.Action;

import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.apache.struts2.ServletActionContext;
import org.database.Beam.User;
import org.database.Service.LoginService;
import org.database.ServiceImp.LoginServiceImp;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate() {
		if (StringUtils.isEmpty(user.getAccount())) {
			addFieldError("userId", "User ID cannot be blank");
		}
		if (StringUtils.isEmpty(user.getPassword())) {
			addFieldError("password", "Password cannot be blank");
		}
		// need a result called input
	}

	public String execute() {
		LoginService loginService = new LoginServiceImp();
		if (loginService.verifyLogin(user)) {
			user=loginService.getUser(user);
			Map session= ActionContext.getContext().getSession();
			session.put("user", user);
			return SUCCESS;
		} else {
			return LOGIN;
		}
	}
//jsp页面中可以直接用property value=user.*获取用户信息，也可以用property value=#session.user获取信息，前提是38行39行
}
