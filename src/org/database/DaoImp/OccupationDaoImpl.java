package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.database.Beam.Occupation;
import org.database.Dao.OccupationDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class OccupationDaoImpl extends JdbcDaoSupport implements OccupationDao {
	private static final class OccupationMapper implements
			RowMapper<Occupation> {
		public Occupation mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
			Occupation occupation = new Occupation();
			occupation.setId(resultSet.getInt("id"));
			occupation.setCatagory(resultSet.getString("catagory"));
			occupation.setOccupation_name(resultSet
					.getString("occupation_name"));
			return occupation;
		}
	}
}
