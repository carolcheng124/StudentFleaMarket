package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.database.Beam.Carts;
import org.database.Dao.CartsDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class CartsDaoImpl extends JdbcDaoSupport implements CartsDao {

	private static final class CartsMapper implements RowMapper<Carts> {
		public Carts mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
			Carts carts = new Carts();
			carts.setId(resultSet.getInt("id"));
			carts.setCustomer_id(resultSet.getInt("customer_id"));
			carts.setProduct_id(resultSet.getInt("product_id"));
			carts.setQuantity(resultSet.getInt("quantity"));
			return carts;
		}
	}

	public void InsertItem(Carts carts) {
		String sql = "INSERT INTO CARTS (customer_id, product_id, quantity) VALUES (?, ?, ?)";
		this.getJdbcTemplate().update(
				sql,
				new Object[] { carts.getCustomer_id(), carts.getProduct_id(), carts.getQuantity() });
	}

	public void DelectItembyUser(int user_id) {
		String sql = "DELECT FROM carts WHERE customer_id=?";
		this.getJdbcTemplate().update(sql, new Object[] { user_id });

	}

	public List<Carts> showIteminCarts(int id) {
		String sql="SELECT * FROM carts WHERE customer_id=?";
		return this.getJdbcTemplate().query(sql, new Object [] {id}, new CartsMapper());
	}
}
