package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.database.Beam.User_registration;
import org.database.Dao.User_registrationDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class User_registrationDaoImpl extends JdbcDaoSupport implements
		User_registrationDao {

	private static final class User_registrationMapper implements
			RowMapper<User_registration> {
		public User_registration mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
			User_registration user_registration = new User_registration();
			user_registration.setUser_id(resultSet.getInt("user_id"));
			user_registration.setRegistration_id(resultSet
					.getInt("registration_id"));
			return user_registration;
		}
	}
			
			
}
