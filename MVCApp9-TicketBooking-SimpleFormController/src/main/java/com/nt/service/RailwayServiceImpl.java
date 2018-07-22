package com.nt.service;

import com.nt.bo.RailwayBO;
import com.nt.dao.RailwayDAO;
import com.nt.dto.RailwayDTO;

public class RailwayServiceImpl implements RailwayService {
	private RailwayDAO dao;

	public RailwayServiceImpl(RailwayDAO dao) {
		
		this.dao = dao;
	}

	@Override
	public String register(RailwayDTO rdto) {
		// create dto object
		
		// convert dto to bo
		RailwayBO bo = new RailwayBO();
		bo.setPname(rdto.getPname());
		bo.setSource(rdto.getSource());
		bo.setDest(rdto.getDest());
		bo.setJounaryStart(rdto.getJounaryStart());
		bo.setFare(rdto.getFare());
		// use dao
		int result = dao.processingTicket(bo);
		
		if (result == 0)
			return "Registation Failed";
		
		else
			return "Registation Succeded your into please check -->"+bo.getPname();
	}

}
