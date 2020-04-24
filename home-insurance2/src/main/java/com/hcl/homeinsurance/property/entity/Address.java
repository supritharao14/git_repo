package com.hcl.homeinsurance.property.entity;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "address_id", unique = true, nullable = false)
	private long addressId;

	@Column(name = "address", length = 45)
	private String address;
	
	@Column(name = "state", length = 45)
	private String state;

	@Column(name = "city", length = 45)
	private String city;
	
	@Column(name = "zip", length = 45)
	private String zip;

	@Column(name = "resdience_use", length = 45)
	private String resdienceUse;

	@Column(name = "resdience_type", length = 45)
	private String resdienceType;
	
	@Column(name = "user_id", length = 45)
	private String userId;

	@Column(name = "address_line_2", length = 45)
	private String addressLine2;



	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getResdienceUse() {
		return resdienceUse;
	}

	public void setResdienceUse(String resdienceUse) {
		this.resdienceUse = resdienceUse;
	}

	public String getResdienceType() {
		return resdienceType;
	}

	public void setResdienceType(String resdienceType) {
		this.resdienceType = resdienceType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public long getAddressId() {
		return addressId;
	}

	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
	


}
