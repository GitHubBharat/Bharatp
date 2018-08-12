package com.er.controller;

import java.sql.Date;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.er.command.EmployeeCommand;

public class EmployeeContoroller extends SimpleFormController {
	@Override
	public void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
System.out.println("EmployeeContoroller.initBinder()");
 SimpleDateFormat sdf = new SimpleDateFormat("DD-MMM-YYYY");
 binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		// create command object and type costing
		EmployeeCommand cmd = (EmployeeCommand) command;

		return new ModelAndView("result", "empCmd", cmd);
	}
}
