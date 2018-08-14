package com.er.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.er.command.AdmissionCommand;

public class AdmissionController extends MultiActionController {
	public ModelAndView insert(HttpServletRequest req, HttpServletResponse res, AdmissionCommand cmd) {
		System.out.println("AdmissionController.insert()");
		ModelAndView mav = null;
		mav = new ModelAndView();
		mav.addObject("operation", "insert ");
		mav.setViewName("user");
		mav.addObject("cmdData", cmd);
		return mav;

	}

	public ModelAndView update(HttpServletRequest req, HttpServletResponse res, AdmissionCommand cmd) {
		System.out.println("AdmissionController.update()");
		ModelAndView mav = null;
		mav = new ModelAndView();
		mav.addObject("operation", "update ");
		mav.setViewName("user");
		mav.addObject("cmdData", cmd);
		return mav;

	}

	public ModelAndView delete(HttpServletRequest req, HttpServletResponse res, AdmissionCommand cmd) {
		System.out.println("AdmissionController.delete()");
		ModelAndView mav = null;
		mav = new ModelAndView();
		mav.addObject("operation", "delete ");
		mav.addObject("cmd", cmd);
		return mav;

	}

	public ModelAndView find(HttpServletRequest req, HttpServletResponse res, AdmissionCommand cmd) {
		System.out.println("AdmissionController.find()");
		ModelAndView mav = null;
		mav = new ModelAndView();
		mav.setViewName("user");
		mav.addObject("cmdData", cmd);
		mav.addObject("operation", "find ");
		
		return mav;

	}

	public ModelAndView invalid(HttpServletRequest req, HttpServletResponse res, AdmissionCommand cmd) {
		System.out.println("AdmissionController.invalid()");
		ModelAndView mav = null;
		mav = new ModelAndView();
		mav.addObject("operation", "invalid ");
		mav.setViewName("user");
		mav.addObject("cmdData", cmd);
		return mav;

	}

}
