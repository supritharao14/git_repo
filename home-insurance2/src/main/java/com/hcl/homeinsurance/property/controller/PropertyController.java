package com.hcl.homeinsurance.property.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.homeinsurance.property.dto.PropertyPostRequestDto;
import com.hcl.homeinsurance.property.exception.PropertyException;
import com.hcl.homeinsurance.property.exception.UpdationException;
import com.hcl.homeinsurance.property.service.PropertyService;


@RestController
@RequestMapping("/properties")
public class PropertyController {
	
	@Autowired
	PropertyService propertyService;
	
	@PutMapping()
	public ResponseEntity<String> updateProperty(@RequestBody PropertyPostRequestDto propertyPostRequestDto) throws PropertyException, UpdationException {

		return new ResponseEntity<String>(propertyService.updateProperty(propertyPostRequestDto), HttpStatus.OK);
	}


}
