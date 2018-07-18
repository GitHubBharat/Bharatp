package com.nt.service;

import com.nt.bo.RailwayBO;
import com.nt.dao.RailwayDAO;
import com.nt.dto.RailwayDTO;

public class RailwayServiceImpl implements RailwayService {
	private RailwayDAO dao;

	public RailwayServiceImpl(RailwayDAO dao) {
		super();
		this.dao = dao;
	}

	@Override
	public String register(RailwayDTO dto) {
		// create dto object
		RailwayDTO stdto = new RailwayDTO();
		// convert dto to bo
		RailwayBO bo = new RailwayBO();
 //use dao
		int result = dao.processingTicket(bo);
		if(result==0)
			return "Registation Failed";
		else
			return "Registation Succeded your into please check -->"+result;
			}

}
