package com.ssafy.model.dao;

import java.util.List;

import com.ssafy.model.dto.User;

public interface UserDao {
	
	int insert(User user);
	
	User searchById(String id);
	
	List<User> selectAll();
}
