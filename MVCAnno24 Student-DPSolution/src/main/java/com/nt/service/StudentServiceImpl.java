package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO dao;

	@Override
	public String register(StudentDTO stdto) {
		StudentBO bo = new StudentBO();

		// convert dto to bo
		bo.setSno(stdto.getSno());
		bo.setSname(stdto.getSname());
		bo.setAddress(stdto.getAddress());
		bo.setCourse(stdto.getCourse());
		bo.setAvg(stdto.getAvg());
		// use dao
		int result = dao.insertRecord(bo);
		if (result == 0)
			return "Registation Failed";
		else
			return "Registation Succeded your into please check -->" + bo.getSno() + "," + bo.getSname() + ","
					+ bo.getCourse() + "," + bo.getAvg();
	}

}
