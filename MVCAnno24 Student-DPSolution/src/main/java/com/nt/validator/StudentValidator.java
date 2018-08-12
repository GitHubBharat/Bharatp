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
		String vstatus = null;

		// type costing

		StudentCommand cmd = (StudentCommand) command;
		vstatus = cmd.getVflag();
		if (vstatus.equalsIgnoreCase("no")) {
			System.out.println("StudentCommandValidator.validate(-,-) -->Server side form validations");
			// form validations
			if (cmd.getSno() <= 0 )
				errors.rejectValue("sno", "sno.invali");
			if (cmd.getSname().equals("") || cmd.getSname() == null)
				errors.rejectValue("sname", "sname.require");
			if (cmd.getCourse().equals("") || cmd.getCourse() == null)
				errors.rejectValue("course", "course.required");
			if (cmd.getAddress().equals("") || cmd.getAddress() == null)
				errors.rejectValue("address", "address.required");
			else if (cmd.getAvg() < 0.0f || cmd.getAvg() > 100.0f) {
				errors.rejectValue("avg", "avg.invalid");
			}
		}
	}
}
