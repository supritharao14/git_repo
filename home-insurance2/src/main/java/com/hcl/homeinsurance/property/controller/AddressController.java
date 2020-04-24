package com.hcl.homeinsurance.property.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hcl.homeinsurance.property.dto.AddressPostRequestDto;
import com.hcl.homeinsurance.property.dto.AddressPostResponceDto;
import com.hcl.homeinsurance.property.dto.AddressPutRequestDto;
import com.hcl.homeinsurance.property.exception.AddressException;
import com.hcl.homeinsurance.property.exception.SaveException;
import com.hcl.homeinsurance.property.exception.UpdationException;
import com.hcl.homeinsurance.property.service.AdressService;

@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	AdressService adressService;

	@PutMapping()
	public ResponseEntity<String> updateAddress(@RequestBody AddressPutRequestDto addressPutRequestDto) throws UpdationException, AddressException {

		return new ResponseEntity<>(adressService.updateAddress(addressPutRequestDto), HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<AddressPostResponceDto> saveAddress(@RequestBody AddressPostRequestDto addressPostRequestDto) throws SaveException {

		return new ResponseEntity<>(adressService.saveAddress(addressPostRequestDto), HttpStatus.OK);
	}

}
