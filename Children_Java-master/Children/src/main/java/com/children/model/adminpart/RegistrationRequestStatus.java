package com.children.model.adminpart;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

public class RegistrationRequestStatus {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private int id;

	@Column
	private String status;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "status", cascade = CascadeType.REMOVE)
	private Set<RegistrationRequest> requests;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<RegistrationRequest> getRequests() {
		return requests;
	}

	public void setRequests(Set<RegistrationRequest> requests) {
		this.requests = requests;
	} 
	
	
}
