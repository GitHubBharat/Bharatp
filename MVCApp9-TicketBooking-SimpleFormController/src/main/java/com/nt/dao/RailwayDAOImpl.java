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
	private static final String INSERT_Railway = "INSERT INTO RAILWAY VALUES (?,?,?,?,?)";
	private JdbcTemplate jt;

	public RailwayDAOImpl(JdbcTemplate jt) {
	
		this.jt = jt;
	}

	@Override
	public int processingTicket(RailwayBO bo) {
		
		int result = jt.update(INSERT_Railway,bo.getPname(),bo.getSource(),bo.getDest(),bo.getJounaryStart(),bo.getFare());
		return result;
	}

}
