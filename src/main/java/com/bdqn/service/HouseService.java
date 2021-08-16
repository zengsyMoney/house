package com.bdqn.service;

import java.util.List;
import java.util.Map;

import com.bdqn.pojo.House;

public interface HouseService {
	public List<House> selectHouse();
	
	public List<House> DimSelect(Map<String, Object> map);
}
