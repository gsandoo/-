package com.closet.eun;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public int insertMember(MemberDTO dto) {
		return this.sqlSession.insert("insertMember", dto);
	}

	@Override
	public MemberDTO getMember(String id) {
		return this.sqlSession.selectOne("getMember", id);
	}
}
