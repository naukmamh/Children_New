package com.children.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Transactional
public class House implements Serializable{
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable=false)
	private int id;
	
	@NotNull
	@Length(min=3)
	@NotEmpty
	@Column
	private String name;
	
	@NotNull
	@NotEmpty
	@Column
	private String city;

	@NotNull
	@NotEmpty
	@Column
	private String street;

	@NotNull
	@NotEmpty
	@Column
	private String number;

	@NotEmpty
	@Column
	private String description;

	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "house", cascade = CascadeType.REMOVE)
	private Set<Child> children; 
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
