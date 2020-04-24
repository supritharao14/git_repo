package com.hcl.homeinsurance.property.entity;

import java.io.Serializable;


import javax.persistence.*;

@Entity
@Table(name = "home_info")
@NamedQuery(name = "PropertyInformation.findAll", query = "SELECT h FROM PropertyInformation h")
public class PropertyInformation implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idhome_info", unique = true, nullable = false)
	private long propertyInformationId;

	@Column(name = "dwelling_style", length = 45)
	private String dwellingStyle;

	@Column(name = "number_of_full_baths", length = 45)
	private String numberOfFullBaths;

	@Column(name = "number_of_half_baths", length = 45)
	private String numberOfHalfBaths;

	@Column(length = 45)
	private String pool;

	@Column(name = "roof_type", length = 45)
	private String roofType;

	@Column(name = "square_footage", length = 45)
	private String squareFootage;

	@Column(name = "type_garage", length = 45)
	private String typeGarage;

	@Column(name = "value_of_home", length = 45)
	private String valueOfHome;

	@Column(name = "year_was_built", length = 45)
	private String yearWasBuilt;
	
	@Column(name = "address_id")
	private int addressId;

	public PropertyInformation() {
	}

	public String getDwellingStyle() {
		return this.dwellingStyle;
	}

	public void setDwellingStyle(String dwellingStyle) {
		this.dwellingStyle = dwellingStyle;
	}

	public String getNumberOfFullBaths() {
		return this.numberOfFullBaths;
	}

	public void setNumberOfFullBaths(String numberOfFullBaths) {
		this.numberOfFullBaths = numberOfFullBaths;
	}

	public String getNumberOfHalfBaths() {
		return this.numberOfHalfBaths;
	}

	public void setNumberOfHalfBaths(String numberOfHalfBaths) {
		this.numberOfHalfBaths = numberOfHalfBaths;
	}

	public String getPool() {
		return this.pool;
	}

	public void setPool(String pool) {
		this.pool = pool;
	}

	public String getRoofType() {
		return this.roofType;
	}

	public void setRoofType(String roofType) {
		this.roofType = roofType;
	}

	public String getSquareFootage() {
		return this.squareFootage;
	}

	public void setSquareFootage(String squareFootage) {
		this.squareFootage = squareFootage;
	}

	public String getTypeGarage() {
		return this.typeGarage;
	}

	public void setTypeGarage(String typeGarage) {
		this.typeGarage = typeGarage;
	}

	public String getValueOfHome() {
		return this.valueOfHome;
	}

	public void setValueOfHome(String valueOfHome) {
		this.valueOfHome = valueOfHome;
	}

	public String getYearWasBuilt() {
		return this.yearWasBuilt;
	}

	public void setYearWasBuilt(String yearWasBuilt) {
		this.yearWasBuilt = yearWasBuilt;
	}

	public long getPropertyInformationId() {
		return propertyInformationId;
	}

	public void setPropertyInformationId(long propertyInformationId) {
		this.propertyInformationId = propertyInformationId;
	}

}