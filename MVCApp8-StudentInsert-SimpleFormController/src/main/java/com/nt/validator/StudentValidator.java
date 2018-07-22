package com.nt.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nt.command.StudentCommand;

public class StudentValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {

		return clazz.isAssignableFrom(StudentCommand.class);
	}

	@Override
	public void validate(Object command, Errors errors) {
		
		System.out.println("validator called");
		// type costing
		StudentCommand cmd = (StudentCommand) command;
		// form validations
		if (cmd.getSno() <= 0)
			errors.rejectValue("sno", "sno.invali");
		if (cmd.getAvg() <= 0)
			errors.rejectValue("avg", "avg.invalid");
		if (cmd.getSname() == ("") || cmd.getSname() == null)
			errors.rejectValue("sname", "sname.require");
		if (cmd.getCourse() == ("") || cmd.getCourse() == null)
			errors.rejectValue("course", "course.required");
		if (cmd.getAddress() == ("") || cmd.getAddress() == null)
			errors.rejectValue("address", "address.required");
	}

}
