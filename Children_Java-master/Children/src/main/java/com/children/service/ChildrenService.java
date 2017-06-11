package com.children.service;

import java.util.List;

import com.children.model.Child;

public interface ChildrenService {
	Child findById(int id);

	void saveChild(Child child);

	void updateChild(Child child);

	void deleteChild(int id);

	List<Child> findAllChildren();

	List<Child> findAllChildrenByHouse(int houseId);
}
