/**
 * 
 */
package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.RailwayCommand;

/**
 * @author ErBharatp
 *
 */
public class RailValidator implements Validator {
 
	@Override
	public boolean supports(Class<?> clazz) {
		
		return clazz.isAssignableFrom(RailwayCommand.class);
		
	}

	@Override
	public void validate(Object command, Errors errors) {
		//type casting 
		RailwayCommand cmd =(RailwayCommand)command;
		//form validation
		/*if(cmd.getFare()<0||cmd.getFare()<100) {
			errors.rejectValue(" fare", " fare.invalid");
		}*/
		if(cmd.getPname().equals("")||cmd.getPname()==null) {
			errors.rejectValue("pname", "pname.requried");
		}
		if(cmd.getSource().equals("")||cmd.getSource()==null) {
			errors.rejectValue("source", "source.requried");
		}
		if(cmd.getDest().equals("")||cmd.getDest()==null) {
			errors.rejectValue("dest", "dest.requried");
		}
		
		if(cmd.getJounaryStart().equals("")||cmd.getJounaryStart()==null) {
			errors.rejectValue(" jounaryStart", " jounaryStart.requried");
		}
		else {
			if(cmd.getJounaryStart().length()<5) {
				errors.rejectValue(" jounaryStart", " jounaryStart.minlength");
			}
		}
	}

}
