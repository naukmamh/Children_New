package com.children.dao;

import java.util.List;

import com.children.model.House;


public interface HouseDao {
	House findById(Integer integer);
	
	void save(House house);
	
	void deleteById(int id);
	
	List<House> findAllHouses();
}
