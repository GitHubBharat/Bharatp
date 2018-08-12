package com.er.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.er.dto.StudentDTO;

public class StudentController extends AbstractController {

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		List<StudentDTO> listDTO = new ArrayList();
		StudentDTO dto = new StudentDTO();
		dto.setSno(101);
		dto.setSname("Bharat");
		dto.setSadd("Bhopal");
		dto.setAvg(75.2f);
		StudentDTO dto1 = new StudentDTO();
		dto1.setSno(102);
		dto1.setSname("sandeep");
		dto1.setSadd("jabalpur");
		dto1.setAvg(76.2f);

		StudentDTO dto2 = new StudentDTO();
		dto2.setSno(103);
		dto2.setSname("Raaz");
		dto2.setSadd("Panna");
		dto2.setAvg(86.2f);
		listDTO.add(dto);
		listDTO.add(dto1);
		listDTO.add(dto2);
		 //return MAV object
		 if(request.getParameter("type").equalsIgnoreCase("xls")){
			 return new ModelAndView("stpdf","studList",listDTO);
		 }
		 else{
			
			 return new ModelAndView("stxls","studList",listDTO);
		 }
	}

}
