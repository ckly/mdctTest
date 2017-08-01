package com.test.bchtest.model.dao.member;

import java.util.List;

import com.test.bchtest.model.dto.member.MemberDTO;

public interface MemberDao {
	 public List<MemberDTO> memberList();
	 public void insertMember(MemberDTO dto);
	 public MemberDTO viewMember(String userid);
	 public void deleteMember(String userid);
	 public void updateMember(MemberDTO dto);
	 public boolean checkPw(String userid,String passwd);
}
