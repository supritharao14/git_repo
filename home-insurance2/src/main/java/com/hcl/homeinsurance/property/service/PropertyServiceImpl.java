package com.hcl.homeinsurance.property.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.homeinsurance.property.dto.PropertyPostRequestDto;
import com.hcl.homeinsurance.property.entity.PropertyInformation;
import com.hcl.homeinsurance.property.exception.PropertyException;
import com.hcl.homeinsurance.property.exception.UpdationException;
import com.hcl.homeinsurance.property.repository.PropertyInformationRepository;
import com.hcl.homeinsurance.property.utility.PropertyUtility;

@Service
public class PropertyServiceImpl implements PropertyService{
	
	@Autowired
	PropertyInformationRepository propertyInformationRepository;


	@Override
	public String updateProperty(PropertyPostRequestDto propertyPostRequestDto) throws PropertyException, UpdationException{
		
		Optional<PropertyInformation> property = propertyInformationRepository.findById(propertyPostRequestDto.getPropertyInformationId());
		if (!property.isPresent()) {
			throw new PropertyException(PropertyUtility.PROPERTY_ERROR);
		
		} else {
			
		
			if (propertyPostRequestDto.getDwellingStyle() != null && !propertyPostRequestDto.getDwellingStyle().isEmpty())
				property.get().setDwellingStyle(propertyPostRequestDto.getDwellingStyle());
			
			if (propertyPostRequestDto.getNumberOfFullBaths() != null && !propertyPostRequestDto.getNumberOfFullBaths().isEmpty())
				property.get().setNumberOfFullBaths(propertyPostRequestDto.getNumberOfFullBaths());
			
			if (propertyPostRequestDto.getNumberOfHalfBaths() != null && !propertyPostRequestDto.getNumberOfHalfBaths().isEmpty())
				property.get().setNumberOfHalfBaths(propertyPostRequestDto.getNumberOfHalfBaths());
			if (propertyPostRequestDto.getPool() != null && !propertyPostRequestDto.getPool().isEmpty())
				property.get().setPool(propertyPostRequestDto.getPool());
			if (propertyPostRequestDto.getRoofType()!= null && !propertyPostRequestDto.getRoofType().isEmpty())
				property.get().setRoofType(propertyPostRequestDto.getRoofType());
			if (propertyPostRequestDto.getSquareFootage()!= null && !propertyPostRequestDto.getSquareFootage().isEmpty())
				property.get().setSquareFootage(propertyPostRequestDto.getSquareFootage());
			if (propertyPostRequestDto.getTypeGarage()!= null && !propertyPostRequestDto.getTypeGarage().isEmpty())
				property.get().setTypeGarage(propertyPostRequestDto.getTypeGarage());
			if (propertyPostRequestDto.getValueOfHome()!= null && !propertyPostRequestDto.getValueOfHome().isEmpty())
				property.get().setValueOfHome(propertyPostRequestDto.getValueOfHome());
			if (propertyPostRequestDto.getYearWasBuilt()!= null && !propertyPostRequestDto.getYearWasBuilt().isEmpty())
				property.get().setYearWasBuilt(propertyPostRequestDto.getYearWasBuilt());

			if (propertyInformationRepository.save(property.get()) == null)

				throw new UpdationException("updation failure");
			
		}

		return "Updated successfully!";

	}
	}


