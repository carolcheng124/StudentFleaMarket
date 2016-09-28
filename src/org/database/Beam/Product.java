package org.database.Beam;

public class Product {
	int id, salespersons_id, inventory_amount, store_id, visit_times;
	String name, product_kind, description;
	float price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalespersons_id() {
		return salespersons_id;
	}

	public void setSalespersons_id(int salespersons_id) {
		this.salespersons_id = salespersons_id;
	}

	public int getInventory_amount() {
		return inventory_amount;
	}

	public void setInventory_amount(int inventory_amount) {
		this.inventory_amount = inventory_amount;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public int getVisit_times() {
		return visit_times;
	}

	public void setVisit_times(int visit_times) {
		this.visit_times = visit_times;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProduct_kind() {
		return product_kind;
	}

	public void setProduct_kind(String product_kind) {
		this.product_kind = product_kind;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
