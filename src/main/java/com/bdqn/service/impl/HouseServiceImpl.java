package com.bdqn.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.catalina.util.SessionConfig;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.bdqn.dao.HouseDao;
import com.bdqn.pojo.House;
import com.bdqn.service.HouseService;
import com.bdqn.util.MyBatisFactory;

public class HouseServiceImpl implements HouseService{
	private SqlSessionFactory factory=MyBatisFactory.getMyBatisFactory();
	private SqlSession session;
	private HouseDao houseDao;
	
	private void init() {
		session=factory.openSession();
		houseDao=session.getMapper(HouseDao.class);
	}
	@Override
	public List<House> selectHouse() {
		init();
		List<House> allHouse=houseDao.selectHouse();
		return allHouse;
	}
	@Override
	public List<House> DimSelect(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return null;
	}

}
