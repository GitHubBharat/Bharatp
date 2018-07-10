package com.nt.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.nt.service.WishGenerateService;

public class WishMessageGeneteController extends AbstractController {
	private WishGenerateService service;

	public WishMessageGeneteController(WishGenerateService service) {

		this.service = service;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		String msg = null;
		msg=service.generateWish("   Bharat");
		return new ModelAndView("wish", "wmsg", msg);
	}

}
