package com.test.bchtest.model.dao.procedure;

import java.util.List;

import com.test.bchtest.model.dto.procedure.RandomRankDTO;

public interface ProcedureDao {
//	public void callProcedure(int ranVal,int limVal);
	public List<RandomRankDTO> randomList();
}
