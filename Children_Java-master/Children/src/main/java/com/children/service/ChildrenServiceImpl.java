package com.children.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.children.dao.ChildDao;
import com.children.model.Child;

@Service("childrenService")
public class ChildrenServiceImpl implements ChildrenService{
	@Autowired
	ChildDao childDao;

	@Override
	public Child findById(int id) {
		return childDao.findById(id);
	}

	@Override
	public void saveChild(Child child) {
		childDao.save(child);
		
	}

	@Override
	public void updateChild(Child child) {
		Child c = childDao.findById(child.getId());
		if(c!= null){
			c.setDescription(child.getDescription());
			c.setFirstName(child.getFirstName());
			c.setLastName(child.getLastName());
			c.setBirthDate(child.getBirthDate());
			
			
		}
		
	}

	@Override
	public void deleteChild(int id) {
		childDao.deleteById(id);
		
	}

	@Override
	public List<Child> findAllChildren() {
		return childDao.findAllChildren();
	}

	@Override
	public List<Child> findAllChildrenByHouse(int houseId) {
		return childDao.findAllChildrenByHouse(houseId);
	}

	@Override
	public List<Child> findAllChildrenWithFilters(Map<String, String> filters) {
		return childDao.findAllChildrenWithFilters(filters);
	}

}
