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

import com.nt.command.RailwayCommand;
import com.nt.dao.RailwayDAO;
import com.nt.dto.RailwayDTO;
import com.nt.service.RailwayService;

/**
 * @author ErBharatp
 *
 */
public class RailwayTicketGenerateController extends SimpleFormController {

	private RailwayService service;

	public RailwayTicketGenerateController(RailwayService service) {
		this.service = service;
	}

	@Override
	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		// type cast command class object
		RailwayCommand cmd = (RailwayCommand) command;

		// convert cmd to dto object
		RailwayDTO dto = new RailwayDTO();
		BeanUtils.copyProperties(dto, cmd);
		/*dto.setSname(cmd.getSname());
		dto.setAddress(cmd.getAddress());
		dto.setCourse(cmd.getCourse());
		dto.setAvg(cmd.getAvg());*/
		// use service
		String result = null;
		result = service.register(dto);

		return new ModelAndView(result, "resMsg", result);
	}
	@Override
	protected ModelAndView handleInvalidSubmit(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		// TODO Auto-generated method stub
		return new ModelAndView("rail_error");
	}
}
