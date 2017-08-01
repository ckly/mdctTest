package com.test.bchtest.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.test.bchtest.model.dto.member.MemberDTO;
import com.test.bchtest.service.member.MemberService;

@Controller
@RequestMapping("/member/*")
public class MemberController {

	@Inject
	MemberService memberService;
	
	@RequestMapping("/view.do")
	public ModelAndView listAll(){
		List<MemberDTO> list = memberService.memberList();
		ModelAndView mav  = new ModelAndView();
		mav.setViewName("member/memberList");
		mav.addObject("list",list);
		return mav;
	}
		
}
