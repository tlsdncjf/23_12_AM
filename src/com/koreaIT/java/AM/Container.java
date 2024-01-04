package com.koreaIT.java.AM;

import com.koreaIT.java.AM.dao.ArticleDao;
import com.koreaIT.java.AM.dao.MemberDao;
import com.koreaIT.java.AM.service.ArticleService;
import com.koreaIT.java.AM.service.MemberService;

public class Container {
	public static ArticleDao articleDao;
	public static MemberDao memberDao;

	public static ArticleService articleService;
	public static MemberService memberService;

	public static void init() {
		memberDao = new MemberDao();
		articleDao = new ArticleDao();

		memberService = new MemberService();
		articleService = new ArticleService();
	}
}