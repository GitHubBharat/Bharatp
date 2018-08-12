/**
 * 
 */
package com.er.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.er.command.JobSeekerCommand;

/**
 * @author ErBharatp
 *
 */
public class JobNaukariController extends AbstractWizardFormController {

	@Override
	public ModelAndView processFinish(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("JobNaukariController.processFinish()");
		JobSeekerCommand cmd = (JobSeekerCommand) command;
		return new ModelAndView("result", "cmdData", cmd);
	}

	@Override
	protected ModelAndView processCancel(HttpServletRequest request, HttpServletResponse response, Object command,
			BindException errors) throws Exception {
		System.out.println("JobNaukariController.processCancel()");
		return new ModelAndView("welcome");
	}

}
