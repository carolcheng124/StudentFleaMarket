package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.database.Beam.User;
import org.database.Dao.UserDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class UserDaoImpl extends JdbcDaoSupport implements UserDao {
	public  List<User> SearchAllUser() {
		String sql = "SELECT * FROM USER";
		return this.getJdbcTemplate().query(sql, new UserMapper());
	}

	public List<String> FindbyGender() {
		String sql = "SELECT account FROM USER WHERE gender=1";
		return this.getJdbcTemplate().queryForList(sql, String.class);
	}
	
	public List<User> SearchByAccount(String account) {
		String sql="SELECT * FROM USER WHERE account=?";
		return this.getJdbcTemplate().query(sql, new Object [] {account}, new UserMapper());
	}
	
	public List<User> SearchById(int id) {
		String sql="SELECT * FROM USER WHERE id=?";
		return this.getJdbcTemplate().query(sql, new Object [] {id}, new UserMapper());
	}
	
	public List<User> Verify(String account, String password) {
		String sql = "SELECT * FROM USER WHERE ACCOUNT=? AND PASSWORD=?";
		return this.getJdbcTemplate().query(sql,
				new Object[] { account, password }, new UserMapper());
	}

	public void InsertUser(User user) {
		String sql = "INSERT INTO USER (ACCOUNT, PASSWORD, NAME, GENDER, AGE, PHONE, STREET, CITY, STATE, ZIP_CODE, GRADE, SCHOOL, STORE_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		
		this.getJdbcTemplate().update(sql,
				new Object[] { user.getAccount(), user.getPassword(),
						user.getName(), user.getGender(), user.getAge(),
						user.getPhone(), user.getStreet(), user.getCity(),
						user.getState(), user.getZip_code(),
						user.getGrade(), user.getSchool(), user.getStore_id() });
	}
	

	private static final class UserMapper implements RowMapper<User> {
		public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			User user = new User();
			user.setId(resultSet.getInt("id"));
			user.setAccount(resultSet.getString("account"));
			user.setPassword(resultSet.getString("password"));
			user.setName(resultSet.getString("name"));
			user.setGender(resultSet.getInt("gender"));
			user.setAge(resultSet.getInt("age"));
			user.setPhone(resultSet.getString("phone"));
			user.setStreet(resultSet.getString("street"));
			user.setCity(resultSet.getString("city"));
			user.setState(resultSet.getString("state"));
			user.setZip_code(resultSet.getInt("zip_code"));
			user.setGrade(resultSet.getString("grade"));
			user.setSchool(resultSet.getString("school"));
			user.setStore_id(resultSet.getInt("store_id"));
			return user;
		}
	}

	public List<User> SearchByProduct(String product_kind) {
		String sql="SELECT U.* FROM user U, product P WHERE P.PRODUCT_KIND=? and U.id=P.salespersons_id";
		return this.getJdbcTemplate().query(sql, new Object [] {product_kind}, new UserMapper());
	}



}
