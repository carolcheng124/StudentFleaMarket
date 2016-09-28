package org.database.Action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.database.Beam.Product;
import org.database.Beam.Store;
import org.database.Beam.User;
import org.database.Service.ShowProductService;
import org.database.Service.ShowStoreService;
import org.database.Service.ShowUserService;
import org.database.ServiceImp.ShowStoreServiceImpl;
import org.database.ServiceImp.ShowUserServiceImpl;
import org.database.ServiceImp.ShowproductServiceImpl;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowProductAction extends ActionSupport {
	private List<Product> listProducts;
	private User user;
	private Product product;
	private List<User> salespersonList;
	private List<Store> storelistList;

	public List<Product> getListProducts() {
		return listProducts;
	}

	public void setListProducts(List<Product> listProducts) {
		this.listProducts = listProducts;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public List<User> getSalespersonList() {
		return salespersonList;
	}

	public void setSalespersonList(List<User> salespersonList) {
		this.salespersonList = salespersonList;
	}

	public List<Store> getStorelistList() {
		return storelistList;
	}

	public void setStorelistList(List<Store> storelistList) {
		this.storelistList = storelistList;
	}

	public String execute() {
		ActionContext.getContext().getSession().get("user");// 获取session值
		user = (User) ActionContext.getContext().getSession().get("user");
		System.out.println(user.getName());
		ShowProductService showProductService = new ShowproductServiceImpl();
		setListProducts(showProductService.showAllProducts());
		ServletActionContext.getRequest().setAttribute("showproduct",
				listProducts);
		return SUCCESS;
	}

	public String searchByCatagory() {
		ActionContext.getContext().getSession().get("user");// 获取session值
		ShowProductService showProductService = new ShowproductServiceImpl();
		ShowStoreService showStoreService = new ShowStoreServiceImpl();
		ShowUserService showUserService = new ShowUserServiceImpl();
		setSalespersonList(showUserService.showUserbyProduct(product));
		setStorelistList(showStoreService.showStoresbyProduct(product));
		setListProducts(showProductService.showByCatagory(product));
		ServletActionContext.getRequest().setAttribute("showuser",
				salespersonList);
		ServletActionContext.getRequest().setAttribute("showstore",
				storelistList);
		ServletActionContext.getRequest().setAttribute("showproduct",
				listProducts);
		return SUCCESS;
	}

	public String searchByName() {
		ActionContext.getContext().getSession().get("user");// 获取session值
		ShowProductService showProductService = new ShowproductServiceImpl();
		ShowStoreService showStoreService = new ShowStoreServiceImpl();
		ShowUserService showUserService = new ShowUserServiceImpl();
		setSalespersonList(showUserService.showUserbyProduct(product));
		setStorelistList(showStoreService.showStoresbyProduct(product));
		setListProducts(showProductService.showByName(product));
		ServletActionContext.getRequest().setAttribute("showproduct",
				listProducts);
		ServletActionContext.getRequest().setAttribute("showuser",
				salespersonList);
		ServletActionContext.getRequest().setAttribute("showstore",
				storelistList);
		return SUCCESS;
	}
}
