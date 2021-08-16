package com.bdqn.service.impl;

import org.apache.ibatis.session.SqlSession;

import com.bdqn.dao.UsersDao;
import com.bdqn.pojo.Users;
import com.bdqn.service.UsersService;
import com.bdqn.util.MyBatisFactory;

public class UsersServiceImpl implements UsersService{
	private SqlSession session;
	private UsersDao usersDao;
	
	private void init() {
		session=MyBatisFactory.getMyBatisFactory().openSession();
		usersDao=session.getMapper(UsersDao.class);
	}

	@Override
	public Users login(Users users) {
		init();
		Users user=new Users();
		try {
			user=usersDao.login(users);
			session.commit();
		} catch (Exception e) {
			session.rollback();
		}finally {
			session.close();
		}
		return user;
	}
	
	@Override
	public int register(Users user) {
		init();
		int count=0;
		try {
			count=usersDao.register(user);
			session.commit();
		} catch (Exception e) {
			session.rollback();
		}finally {
			session.close();
		}
		return count;
	}

}
