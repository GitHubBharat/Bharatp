/**
 * 
 */
package com.er.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.er.command.StudentCommand;

/**
 * @author ErBharatp
 *
 */
public class StudentSimpleController extends SimpleFormController {

	@Override
	public Map referenceData(HttpServletRequest request) throws Exception {
		System.out.println("StudentSimpleController.referenceData()");
		Map<String, List<String>> map = new HashMap<>();
		List<String> courses = new ArrayList<>();
		courses.add("java");
		courses.add("SAP");
		courses.add("DBA");
		courses.add("Andorid");
		courses.add("Hadoop");
		map.put("courses", courses);

		List<String> hobbies = new ArrayList<>();
		hobbies.add("Sleeping");
		hobbies.add("Chatting");
		hobbies.add("Study");
		hobbies.add("Roaming");
		hobbies.add("Traving");
		map.put("hobbies", hobbies);

		List<String> country = new ArrayList<>();
		country.add("INDIA");
		country.add("JAPAN");
		country.add("USA");
		country.add("UAE");
		country.add("CHINA");
		map.put("country", country);
		return map;
	}

	@Override
	public ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		return new ModelAndView("result");

	}

}
