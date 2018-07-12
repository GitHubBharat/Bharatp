package com.nt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.dto.EmployeeDTO;
import com.nt.service.ListEmployeesService;

public class ListEmployeeController extends AbstractController {
	private ListEmployeesService service;

	public ListEmployeeController(ListEmployeesService service) {
		this.service = service;
	}

	@Override
	public  ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// use dto

		List<EmployeeDTO> listdto = null;
		listdto = service.retriveEmp();
		return new ModelAndView("report_emps", "emplist", listdto);

	}//method

}//class
