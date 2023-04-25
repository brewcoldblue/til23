package com.ssafy.model.service;

import java.util.List;

import com.ssafy.model.dto.User;

public interface UserService {

	int insert(User user);
	
	User searchById(String id);
	
	List<User> selectAll();
	
}
