/**
 * 
 */
package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.nt.command.StudentCommand;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

/**
 * @author ErBharatp
 *
 */
public class StudentInsertController extends SimpleFormController {

	private StudentService service;

	public StudentInsertController() {
		System.out.println("StudentInsertController.StudentInsertController()"); // TODO Auto-generated constructor stub
	}

	public StudentInsertController(StudentService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {

		// type cast command class object
		StudentCommand cmd = (StudentCommand) command;

		// convert cmd to dto object
		StudentDTO dto = new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);
		// use service
		String result = null;
		result = service.register(dto);

		return new ModelAndView(getSuccessView(), "resMsg", result);
	}

	@Override
	public ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response) throws Exception {

		// TODO Auto-generated method stub
		return new ModelAndView("error");
	}
}
