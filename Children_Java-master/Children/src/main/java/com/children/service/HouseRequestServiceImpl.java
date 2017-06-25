package com.children.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.children.dao.HouseRequestDao;
import com.children.model.HouseRequest;

@Service("houseRequestService")
public class HouseRequestServiceImpl implements HouseRequestService{
	@Autowired
	private HouseRequestDao houseRequestDao;

	@Override
	public HouseRequest findById(int id) {
		return houseRequestDao.findById(id);
	}

	@Override
	public void saveHouseRequest(HouseRequest houseRequest) {
		houseRequestDao.save(houseRequest);
		
	}

	@Override
	public void updateHouseRequest(HouseRequest houseRequest) {
		HouseRequest h = houseRequestDao.findById(houseRequest.getId());
		if (h!=null){
			h.setCity(houseRequest.getCity());
			h.setDescription(houseRequest.getDescription());
			h.setName(houseRequest.getName());
			h.setNumber(houseRequest.getNumber());
			h.setStreet(houseRequest.getStreet());
			h.setFirstName(houseRequest.getFirstName());
			h.setLastName(houseRequest.getLastName());
			h.setEmail(houseRequest.getEmail());
			h.setSsoId(houseRequest.getSsoId());
			h.setPassword(houseRequest.getPassword());
		}
		
	}

	@Override
	public void deleteHouseRequest(int id) {
		houseRequestDao.deleteById(id);
		
	}

	@Override
	public List<HouseRequest> findAllHouseRequests() {
		return houseRequestDao.findAllRequests();
	}


}
