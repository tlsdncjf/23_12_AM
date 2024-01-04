package com.koreaIT.java.AM.dao;

import java.util.ArrayList;
import java.util.List;

import com.koreaIT.java.AM.dto.Article;

public class ArticleDao {
	public List<Article> articles;

	public ArticleDao() {
		articles = new ArrayList<>();
	}
}