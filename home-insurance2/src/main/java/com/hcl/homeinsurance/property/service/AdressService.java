package com.hcl.homeinsurance.property.service;

import com.hcl.homeinsurance.property.dto.AddressPostRequestDto;
import com.hcl.homeinsurance.property.dto.AddressPostResponceDto;
import com.hcl.homeinsurance.property.dto.AddressPutRequestDto;
import com.hcl.homeinsurance.property.exception.AddressException;
import com.hcl.homeinsurance.property.exception.SaveException;
import com.hcl.homeinsurance.property.exception.UpdationException;

public interface AdressService {

	String updateAddress(AddressPutRequestDto addressPutRequestDto) throws UpdationException, AddressException;

	AddressPostResponceDto saveAddress(AddressPostRequestDto addressPostRequestDto) throws SaveException;

}
