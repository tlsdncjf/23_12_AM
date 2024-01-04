package com.koreaIT.java.AM.dao;

import java.util.ArrayList;
import java.util.List;

import com.koreaIT.java.AM.dto.Member;

public class MemberDao {
	public List<Member> members;

	public MemberDao() {
		members = new ArrayList<>();
	}
	public List<Member> getMembers() {
		return members;
	}
}