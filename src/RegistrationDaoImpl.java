


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class RegistrationDaoImpl extends JdbcDaoSupport implements RegistrationDao{
	
	public List<Registration> FindRegByreg(String grade, String school, String store_name) {
		String sql="SELECT * FROM registration WHERE grade=? AND school=? AND school_id=(SELECT id FROM store WHERE store_name=?)";
		return this.getJdbcTemplate().query(sql, new Object[] {grade, school, store_name}, new RegistrationMapper());			
	}
	
	private static final class RegistrationMapper implements RowMapper<Registration>{
		public Registration mapRow(ResultSet resultSet, int rowNum) throws SQLException {
			Registration registration=new Registration();
			registration.setId(resultSet.getInt("id"));
			registration.setGrade(resultSet.getString("grade"));
			registration.setSchool(resultSet.getString("school"));
			registration.setSchool_id(resultSet.getInt("school_id"));
			return registration;
		}
	}
}
