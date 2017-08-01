package com.test.bchtest.service.procedure;

import java.util.List;

import com.test.bchtest.model.dto.procedure.RandomRankDTO;

public interface ProcedureService {
//	public void callProcedure(int ranVal,int limVal);
	public List<RandomRankDTO> randomList();
}
