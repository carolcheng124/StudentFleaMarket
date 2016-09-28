package org.database.Action;

import java.util.List;

import org.database.Beam.Carts;
import org.database.Beam.Product;
import org.database.Beam.User;
import org.database.Service.AddtoCartsService;
import org.database.ServiceImp.AddtoCartsServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CheckoutAction extends ActionSupport{
	private Product product;
	private User user;
	private List<Carts> cartslist;
	private int quantity;
	
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

	public List<Carts> getCartslist() {
		return cartslist;
	}

	public void setCartslist(List<Carts> cartslist) {
		this.cartslist = cartslist;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String execute() {
		ActionContext.getContext().getSession().get("user");// ��ȡsessionֵ
		user = (User) ActionContext.getContext().getSession().get("user");
		AddtoCartsService addtoCartsService=new AddtoCartsServiceImpl();
		addtoCartsService.AddItemtoCarts(user, product, quantity);
		return SUCCESS;
	}
	
	public String CheckoutSuccess(){
		ActionContext.getContext().getSession().get("user");// ��ȡsessionֵ
		user = (User) ActionContext.getContext().getSession().get("user");
		AddtoCartsService addtoCartsService=new AddtoCartsServiceImpl();
		addtoCartsService.DelectItemfromCarts(user);
		return SUCCESS;
	}
	
	public String showCarts(){
		ActionContext.getContext().getSession().get("user");// ��ȡsessionֵ
		user = (User) ActionContext.getContext().getSession().get("user");
		AddtoCartsService addtoCartsService=new AddtoCartsServiceImpl();
		addtoCartsService.ShowIteminCarts(user);
		return SUCCESS;
	}
}
