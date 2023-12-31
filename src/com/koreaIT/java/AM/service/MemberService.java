package com.koreaIT.java.AM.service;

import java.util.List;

import com.koreaIT.java.AM.Container;
import com.koreaIT.java.AM.dao.MemberDao;
import com.koreaIT.java.AM.dto.Member;

public class MemberService {
	private MemberDao memberDao;

	public MemberService() {
		memberDao = Container.memberDao;
	}

	public List<Member> getMembers() {
		return memberDao.getMembers();
	}

}