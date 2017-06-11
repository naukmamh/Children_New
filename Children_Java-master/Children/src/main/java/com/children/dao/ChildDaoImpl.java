package com.children.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.children.model.Child;
import com.children.model.House;

@Repository("wishDao")
public class ChildDaoImpl extends AbstractDao<Integer, Child> implements ChildDao {



	@Override
	public void deleteById(int id) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("id", id));
		Child child = (Child) crit.uniqueResult();
		delete(child);

	}



	@Override
	public Child findById(Integer id) {
		return getByKey(id);
	}

	@Override
	public void save(Child child) {
		persist(child);
		
	}

	@Override
	public List<Child> findAllChildren() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<Child> children = (List<Child>) criteria.list();
		return children;
	}



	@Override
	public List<Child> findAllChildrenByHouse(int houseId) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("house_id", houseId));
		List<Child> children = (List<Child>) criteria.list();
		return children;
	}

}
