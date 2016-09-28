package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.database.Beam.Product;
import org.database.Dao.ProductDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class ProductDaoImpl extends JdbcDaoSupport implements ProductDao {

	private static final class ProductMapper implements RowMapper<Product> {
		public Product mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
			Product product = new Product();
			product.setId(resultSet.getInt("id"));
			product.setName(resultSet.getString("name"));
			product.setSalespersons_id(resultSet.getInt("salespersons_id"));
			product.setPrice(resultSet.getFloat("price"));
			product.setInventory_amount(resultSet.getInt("inventory_amount"));
			product.setProduct_kind(resultSet.getString("product_kind"));
			product.setDescription(resultSet.getString("description"));
			product.setStore_id(resultSet.getInt("store_id"));
			product.setVisit_times(resultSet.getInt("visit_times"));
			return product;
		}
	}

	public List<Product> SearchAll() {
		String sql = "SELECT * FROM PRODUCT";
		return this.getJdbcTemplate().query(sql, new ProductMapper());
	}

	public List<Product> SearchByCatagory(String product_kind) {
		String sql = "SELECT * FROM PRODUCT WHERE product_kind=?";
		return this.getJdbcTemplate().query(sql, new Object[] { product_kind },
				new ProductMapper());
	}

	public void InsertProduct(Product product) {
		String sql = "INSERT INTO product (name, salespersons_id, price, inventory_amount, product_kind, description, store_id, visit_times) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		this.getJdbcTemplate().update(
				sql,
				new Object[] { product.getName(), product.getSalespersons_id(),
						product.getPrice(), product.getInventory_amount(),
						product.getProduct_kind(), product.getDescription(),
						product.getStore_id(), product.getVisit_times() });

	}

	public List<Product> SearchByName(String name) {
		String sql = "SELECT * FROM PRODUCT WHERE name LIKE %?%";
		return this.getJdbcTemplate().query(sql, new Object[] { name },
				new ProductMapper());
	}

	public void UpdateProduct(Product product) {
		String sql = "UPDATE product SET name=?,salespersons_id=?, price=?, inventory_amount=?, product_kind=?, description=?, store_id=?,"
				+ "visit_times=? WHERE id = ? ";
		this.getJdbcTemplate().update(
				sql,
				new Object[] { product.getName(), product.getSalespersons_id(),
						product.getPrice(), product.getInventory_amount(),
						product.getProduct_kind(), product.getDescription(),
						product.getStore_id(), product.getVisit_times() , product.getId()});
	}

	public List<Product> SearchById(int id) {
		String sql = "SELECT * FROM PRODUCT WHERE id=?";
		return this.getJdbcTemplate().query(sql, new Object[] { id },
				new ProductMapper());
	}
}
