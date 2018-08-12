/**
 * 
 */
package com.nt.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nt.command.StudentCommand;
import com.nt.dto.StudentDTO;
import com.nt.service.StudentService;

/**
 * @author ErBharatp
 *
 */
@Controller
public class StudentInsertController {
	@Autowired
	private StudentService service;


	@RequestMapping(value="/student.htm",method=RequestMethod.GET)
	public String showForm(@ModelAttribute("stdCmd") StudentCommand cmd){
		
	
		return "student";
	}
	
	
	@RequestMapping(value = "/student.htm", method = RequestMethod.POST)
	public String showForm(Map<String, Object> map, @ModelAttribute("stdCmd")StudentCommand command, 
			                                 BindingResult errors) {
		// type cast command class object
		StudentCommand cmd = (StudentCommand) command;

		// convert cmd to dto object
		StudentDTO dto = new StudentDTO();
		BeanUtils.copyProperties(cmd, dto);
		// use service
		String result = null;
		result = service.register(dto);
		map.put("resMsg", result);
		return "student";
	}
   
	@InitBinder
	public  void myInitBinder(WebDataBinder binder){
		SimpleDateFormat sdf=null;
		sdf=new SimpleDateFormat("dd-MM-yyyy");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}


	
}
