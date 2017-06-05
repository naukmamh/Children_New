package com.children.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.children.model.House;

@Repository("houseDao")
public class HouseDaoImpl extends AbstractDao<Integer, House> implements HouseDao {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public House findById(Integer id) {
		return getByKey(id);
	}

	@Override
	public void save(House house) {
		persist(house);

	}

	@Override
	public void deleteById(int id) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("id", id));
		House house = (House) crit.uniqueResult();
		delete(house);

	}

	@Override
	public List<House> findAllHouses() {
		Criteria criteria = createEntityCriteria();
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);
		List<House> houses = (List<House>) criteria.list();
		return houses;
	}

}
