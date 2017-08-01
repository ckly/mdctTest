package com.test.bchtest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.bchtest.model.dao.procedure.ProcedureDao;
import com.test.bchtest.model.dto.procedure.RandomRankDTO;	

@Controller
@RequestMapping("/procedure/*")
public class ProcedureController {
	
	
	@Inject
	ProcedureDao proDao;
	
	@RequestMapping("rank.do")
	public ModelAndView randomRank(){
		
//		proDao.callProcedure(55, 60);
		ModelAndView mav = new ModelAndView();
		List<RandomRankDTO> list= proDao.randomList();
		mav.setViewName("procedure/proView");
		mav.addObject("list",list);
		
		return mav;
	}
	
}
