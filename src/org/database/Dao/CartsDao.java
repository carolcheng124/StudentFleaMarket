package org.database.Dao;

import java.util.List;

import org.database.Beam.Carts;

public interface CartsDao {
	void InsertItem(Carts carts);
	void DelectItembyUser(int user_id);
	List<Carts> showIteminCarts(int id);
}
