package com.hcl.homeinsurance.property.service;

import com.hcl.homeinsurance.property.dto.PropertyPostRequestDto;
import com.hcl.homeinsurance.property.exception.PropertyException;
import com.hcl.homeinsurance.property.exception.UpdationException;

public interface PropertyService {

	String updateProperty(PropertyPostRequestDto propertyPostRequestDto) throws PropertyException, UpdationException;

}
