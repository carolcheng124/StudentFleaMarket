package org.database.Action;


import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.database.Beam.Store;
import org.database.Beam.User;
import org.database.Service.RegisterService;
import org.database.ServiceImp.RegisterServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	private User user;
	private Store store;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
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
		RegisterService registerService=new RegisterServiceImpl();
		if (registerService.registration(user, store)) {
			Map session= ActionContext.getContext().getSession();
			session.put("user", user);
			return SUCCESS;
		} else {
			return INPUT;
		}
		
		
	}
}
