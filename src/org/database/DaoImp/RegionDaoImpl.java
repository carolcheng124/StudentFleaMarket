package org.database.DaoImp;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.database.Beam.Region;
import org.database.Dao.RegionDao;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

public class RegionDaoImpl extends JdbcDaoSupport implements RegionDao {
	private static final class RegionMapper implements RowMapper<Region> {
		public Region mapRow(ResultSet resultSet, int rowNum)
				throws SQLException {
			Region region = new Region();
			region.setId(resultSet.getInt("id"));
			region.setName(resultSet.getString("name"));
			region.setManager_id(resultSet.getInt("manager_id"));
			return region;
		}
	}
}
