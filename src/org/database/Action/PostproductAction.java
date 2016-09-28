package org.database.Action;

import org.database.Beam.Product;
import org.database.Beam.User;
import org.database.Service.PostProductService;
import org.database.ServiceImp.PostproductServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class PostproductAction extends ActionSupport {
	private Product product;
	private User user;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public void validate() {

	}

	public String execute() {
		user=(User)ActionContext.getContext().getSession().get("user");
		PostProductService postProductService=new PostproductServiceImpl();
		postProductService.postProduct(product, user);
		return SUCCESS;
	}
}
