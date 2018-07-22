package com.nt.service;

import com.nt.bo.StudentBO;
import com.nt.dao.StudentDAO;
import com.nt.dto.StudentDTO;

public class StudentServiceImpl implements StudentService {
	private StudentDAO dao;

	public StudentServiceImpl(StudentDAO dao) {
		
		this.dao = dao;
	}

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
			return "Registation Succeded your into please check -->" +bo.getSno()+","+bo.getSname()+","+bo.getCourse()+","+bo.getAvg();
	}

}
