package com.hcl.homeinsurance.property.dto;

public class AddressPutRequestDto {
	private long addressId;
	private String address;
	private String state;
	private String city;
	private String zip;
	private String resdienceUse;
	private String resdienceType;
	private String addressLine2;
	
	
	public long getAddressId() {
		return addressId;
	}
	public void setAddressId(long addressId) {
		this.addressId = addressId;
	}
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
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}


}
