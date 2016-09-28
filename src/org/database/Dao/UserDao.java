package org.database.Dao;

import java.util.List;

import org.database.Beam.User;

public interface UserDao {
	
	public List<User> Verify(String account, String password);
	public void InsertUser(User user);
	public List<User> SearchByAccount(String account);
	public List<User> SearchByProduct(String product_kind);
	public List<User> SearchById(int id);
}
