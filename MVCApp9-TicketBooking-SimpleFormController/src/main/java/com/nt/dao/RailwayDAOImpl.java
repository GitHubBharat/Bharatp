/**
 * 
 */
package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.nt.bo.RailwayBO;

/**
 * @author ErBharatp
 *
 */
public class RailwayDAOImpl implements RailwayDAO {
	private static final String INSERT_STUDENT = "INSERT INTO MVC_STUDENT (MVC_SPRING_SEQ,SNAME,ADDRESS,COURSE,AVG) VALUES (:SNO,:SNAME,:ADDRESS,:COURSE,:AVG)";
	private JdbcTemplate jt;

	public RailwayDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	@Override
	public int processingTicket(RailwayBO bo) {
		
		int result = jt.update(INSERT_STUDENT,bo.getPname(),bo.getFrom(),bo.getTo(),bo.getJounaryStart(),bo.getFare());
		return result;
	}

}
