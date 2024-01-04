package com.koreaIT.java.AM.controller;

import com.koreaIT.java.AM.dto.Member;

public abstract class Controller {

	protected static Member loginedMember = null;

	public abstract void doAction(String actionMethodName, String cmd);

	public boolean isLogined() {
		return loginedMember != null;
	}

}
