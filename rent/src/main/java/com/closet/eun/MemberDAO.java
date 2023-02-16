package com.closet.eun;

public interface MemberDAO {
	public int insertMember(MemberDTO dto);
	
	public MemberDTO getMember(String id);
	
	public int updateMypage(MemberDTO dto);
}
