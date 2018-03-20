package com.demo.dao;
import java.util.List;

import com.demo.entity.Article;
import com.demo.entity.UserInfo;
public interface IUserInfoDAO {
	UserInfo getActiveUser(String userName);
	List<Article> getAllUserArticles();
}