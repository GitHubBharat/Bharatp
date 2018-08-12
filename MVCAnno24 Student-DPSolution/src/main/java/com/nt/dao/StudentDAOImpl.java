/**
 * 
 */
package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nt.bo.StudentBO;

/**
 * @author ErBharatp
 *
 */
@Repository
public class StudentDAOImpl implements StudentDAO {
	private static final String INSERT_STUDENT = "INSERT INTO MVC_STUDENT VALUES(?,?,?,?,?)";
	@Autowired
	private JdbcTemplate jt;

	@Override
	public int insertRecord(StudentBO bo) {

		int result = jt.update(INSERT_STUDENT, bo.getSno(), bo.getSname(), bo.getAddress(), bo.getCourse(),
				bo.getAvg());
		return result;
	}

}
