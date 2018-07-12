
/**
 * 
 */
package com.nt.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;


import com.nt.bo.EmployeeBO;

/**
 * @author ErBharatp
 *
 */
public class EmployeeDAOImpl implements EmployeesDAO {
	private static final String GET_EMP_RECORD = "SELECT EMPNO,ENAME,JOB,SAL FROM EMP";
	private JdbcTemplate jt;

	public EmployeeDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public List<EmployeeBO> retriveAllEmpsRecord() {
		List<EmployeeBO> listBO = null;
		listBO = jt.query(GET_EMP_RECORD, new empResultSetExt ());
		return listBO;
	}
	private class empResultSetExt implements ResultSetExtractor<List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listbo = new ArrayList<EmployeeBO>();
			while(rs.next()) {
				EmployeeBO bo= new  EmployeeBO();
				bo.setEmpno(rs.getInt(1));
				bo.seteName(rs.getString(2));
				bo.setDegs(rs.getString(3));
				bo.setSal(rs.getInt(4));
				listbo.add(bo);
			}
			return listbo;
		}
		
	}
}
	
	
	
	
	
	
	
	
	
/*
	@Override
	public List<EmployeeBO> retriveAllEmpsRecord() {
		List<EmployeeBO> listBO = (List<EmployeeBO>) jt.query(GET_EMP_RECORD, new empResultSetExtrator());
		return listBO;
	}
    private class empResultSetExtrator implements ResultSetExtractor<EmployeeBO>{

		@Override
		public EmployeeBO extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> list = new ArrayList<EmployeeBO>();
			while(rs.next()) {
				EmployeeBO empbo = new EmployeeBO(rs.getInt(1),
						                                                      rs.getString(2),
						                                                      rs.getString(3),
						                                                      rs.getInt(4));
				list.add(empbo);
			}
			return (EmployeeBO) list;
		}
	

	}//
*/
