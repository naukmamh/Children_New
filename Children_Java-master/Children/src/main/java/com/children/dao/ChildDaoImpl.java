package com.children.dao;

import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.children.model.Child;

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


/**
 * 
 * @param filters Map of filter properties, where key is name of the column in database, value is needed value. To make complex criterias (like age) do it above the default case;
 * 
 * 
 */
	@Override
	public List<Child> findAllChildrenWithFilters(Map<String, String> filters) {
		Criteria criteria = createEntityCriteria();
		for(String s:filters.keySet()){
			switch(s){
			case "age":
				//TODO add age criteria here;
				break;
			case "city":
				//TODO add city criteria here;
				break;
			default:
				criteria.add(Restrictions.eq(s, filters.get(s)));
				break;
			}
		}
		return (List<Child>) criteria.list();
	}

}
