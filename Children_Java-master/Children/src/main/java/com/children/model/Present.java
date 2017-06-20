package com.children.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

@Entity
public class Present {
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private int id;
	
	@Past
	@NotNull
	@Column
	private Date dateOpened;
	
	@Column
	private Date dateReceived;

	@Column
	private String letter;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id")
	private User user;
	
	
	
}
