package com.test.bchtest.model.dao.procedure;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.test.bchtest.model.dto.procedure.RandomRankDTO;

@Repository
public class ProcedureDaoImpl implements ProcedureDao {
	
	@Inject
	SqlSession sqlsession;

//	@Override
//	public void callProcedure(int ranVal, int limVal) {
//		Map <String,Object> map =new HashMap<>();
//		map.put("ranVal",ranVal);
//		map.put("limVal",limVal);
//		sqlsession.insert("procedure.insertData",map);
//	}

	@Override
	public List<RandomRankDTO> randomList() {
		return sqlsession.selectList("procedure.randomList");
	}

}
