package com.children.model.adminpart;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.children.model.Child;

@Entity
public class RegistrationRequest {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private int id;
	
	@Column
	private int houseName;
	
	@Column
	private String requesterEmail;
	
	@Column
	private String requestLetter;
	
	@Column
	private Date requestDate;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "statusId")
	private RegistrationRequestStatus status;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getHouseName() {
		return houseName;
	}

	public void setHouseName(int houseName) {
		this.houseName = houseName;
	}

	public String getRequesterEmail() {
		return requesterEmail;
	}

	public void setRequesterEmail(String requesterEmail) {
		this.requesterEmail = requesterEmail;
	}

	public String getRequestLetter() {
		return requestLetter;
	}

	public void setRequestLetter(String requestLetter) {
		this.requestLetter = requestLetter;
	}

	public Date getRequestDate() {
		return requestDate;
	}

	public void setRequestDate(Date requestDate) {
		this.requestDate = requestDate;
	}

	public RegistrationRequestStatus getStatus() {
		return status;
	}

	public void setStatus(RegistrationRequestStatus status) {
		this.status = status;
	}
	
	
}
