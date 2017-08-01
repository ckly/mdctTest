package com.test.bchtest.service.procedure;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.test.bchtest.model.dao.procedure.ProcedureDao;
import com.test.bchtest.model.dto.procedure.RandomRankDTO;

@Service
public class ProcedureServiceImpl implements ProcedureService {

	@Inject
	ProcedureDao proDao;
	
//	@Override
//	public void callProcedure(int ranVal, int limVal) {
//		proDao.callProcedure(ranVal, limVal);
//	}

	@Override
	public List<RandomRankDTO> randomList() {
		return proDao.randomList();
	}

}
