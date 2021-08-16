package com.bdqn.dao;

import com.bdqn.pojo.Users;

public interface UsersDao {
	
	public Users login(Users user);
	
	public int register(Users user);
	
}
