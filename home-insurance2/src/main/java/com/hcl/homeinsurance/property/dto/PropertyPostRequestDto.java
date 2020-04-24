package com.hcl.homeinsurance.property.dto;


public class PropertyPostRequestDto {
	

	private long propertyInformationId;
	private String dwellingStyle;
	private String numberOfFullBaths;
	private String numberOfHalfBaths;
	private String pool;
	private String roofType;
	private String squareFootage;
	private String typeGarage;
	private String valueOfHome;
	private String yearWasBuilt;
	public long getPropertyInformationId() {
		return propertyInformationId;
	}
	public void setPropertyInformationId(long propertyInformationId) {
		this.propertyInformationId = propertyInformationId;
	}
	public String getDwellingStyle() {
		return dwellingStyle;
	}
	public void setDwellingStyle(String dwellingStyle) {
		this.dwellingStyle = dwellingStyle;
	}
	public String getNumberOfFullBaths() {
		return numberOfFullBaths;
	}
	public void setNumberOfFullBaths(String numberOfFullBaths) {
		this.numberOfFullBaths = numberOfFullBaths;
	}
	public String getNumberOfHalfBaths() {
		return numberOfHalfBaths;
	}
	public void setNumberOfHalfBaths(String numberOfHalfBaths) {
		this.numberOfHalfBaths = numberOfHalfBaths;
	}
	public String getPool() {
		return pool;
	}
	public void setPool(String pool) {
		this.pool = pool;
	}
	public String getRoofType() {
		return roofType;
	}
	public void setRoofType(String roofType) {
		this.roofType = roofType;
	}
	public String getSquareFootage() {
		return squareFootage;
	}
	public void setSquareFootage(String squareFootage) {
		this.squareFootage = squareFootage;
	}
	public String getTypeGarage() {
		return typeGarage;
	}
	public void setTypeGarage(String typeGarage) {
		this.typeGarage = typeGarage;
	}
	public String getValueOfHome() {
		return valueOfHome;
	}
	public void setValueOfHome(String valueOfHome) {
		this.valueOfHome = valueOfHome;
	}
	public String getYearWasBuilt() {
		return yearWasBuilt;
	}
	public void setYearWasBuilt(String yearWasBuilt) {
		this.yearWasBuilt = yearWasBuilt;
	}

}
