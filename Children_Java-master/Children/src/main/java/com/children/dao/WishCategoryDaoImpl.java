package com.children.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.children.model.Wish;
import com.children.model.WishCategory;

@Repository("wishCategoryDao")
public class WishCategoryDaoImpl implements WishCategoryDao {
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public WishCategory findById(Integer integer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(WishCategory wishCategory) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<WishCategory> findAllWishCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WishCategory findByName(String name) {
		Criteria c = sessionFactory.getCurrentSession().createCriteria(WishCategory.class);
		c.add(Restrictions.eq("name", name));
		return (WishCategory) c.uniqueResult();
	}

}
