package com.bdqn.dao;

import java.util.List;
import java.util.Map;

import com.bdqn.pojo.House;

public interface HouseDao {
	public List<House> selectHouse();
	
	public List<House> DimSelect(Map<String, Object> house);
}
