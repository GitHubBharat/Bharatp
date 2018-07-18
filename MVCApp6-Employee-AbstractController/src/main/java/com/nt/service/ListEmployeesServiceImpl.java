/**
 * 
 */
package com.nt.service;

import java.util.ArrayList;
import java.util.List;

import com.nt.bo.EmployeeBO;
import com.nt.dao.EmployeeDAOImpl;
import com.nt.dao.EmployeesDAO;
import com.nt.dto.EmployeeDTO;

/**
 * @author ErBharatp
 *
 */
public class ListEmployeesServiceImpl implements ListEmployeesService {
	private EmployeesDAO dao;

	public ListEmployeesServiceImpl(EmployeesDAO dao) {
		this.dao = dao;
	}

	@Override
	public List<EmployeeDTO> retriveAllEmpsRecord() {
		List<EmployeeBO> listbo = dao.retriveAllEmpsRecord();
		// copy list bo object to dto object
		List<EmployeeDTO> dto = new ArrayList<EmployeeDTO>();
		for (EmployeeBO bo : listbo) {
			EmployeeDTO empdto = new EmployeeDTO();
			empdto.setEmpno(bo.getEmpno());
			empdto.seteName(bo.geteName());
			empdto.setDegs(bo.getDegs());
			empdto.setSal(bo.getSal());
			dto.add(empdto);
		} // for
		return dto;
	}// list method

}// class
