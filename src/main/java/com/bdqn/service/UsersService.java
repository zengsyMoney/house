package com.bdqn.service;

import com.bdqn.pojo.Users;

public interface UsersService {
	public Users login(Users users);
	
	public int register(Users user);
}
