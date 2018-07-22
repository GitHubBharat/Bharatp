/**
 * 
 */
package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.nt.bo.StudentBO;

/**
 * @author ErBharatp
 *
 */
public class StudentDAOImpl implements StudentDAO {
	private static final String INSERT_STUDENT = "INSERT INTO MVC_STUDENT VALUES(?,?,?,?,?)";
	private JdbcTemplate jt;

	public StudentDAOImpl(JdbcTemplate jt) {
   
		this.jt = jt;
	}

	@Override
	public int insertRecord(StudentBO bo) {
	
		int result = jt.update(INSERT_STUDENT, bo.getSno(),bo.getSname(),bo.getAddress(),bo.getCourse(),bo.getAvg());
		return result;
	}

}
