package com.children.dao;

import java.util.List;

import com.children.model.Child;


public interface ChildDao {
	Child findById(Integer integer);
	
	void save(Child child);
	
	void deleteById(int id);
	
	List<Child> findAllChildren();
	
	List<Child> findAllChildrenByHouse(int houseId);
}
