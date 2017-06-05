package com.children.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.children.model.Child;
import com.children.model.House;
import com.children.model.Wish;

@Repository("childDao")
public class WishDaoImpl extends AbstractDao<Integer, Wish> implements WishDao {

	@Override
	public Wish findById(Integer id) {
		
		return getByKey(id);
	}

	@Override
	public void save(Wish wish) {
		persist(wish);
		
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Wish> findAllWishes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Wish> findAllWishesByCat(int categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Wish> findAllWishesByChild(int childId) {
		// TODO Auto-generated method stub
		return null;
	}



}
