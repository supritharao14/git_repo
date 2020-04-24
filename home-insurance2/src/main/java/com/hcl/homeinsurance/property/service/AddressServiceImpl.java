package com.hcl.homeinsurance.property.service;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hcl.homeinsurance.property.dto.AddressPostRequestDto;
import com.hcl.homeinsurance.property.dto.AddressPostResponceDto;
import com.hcl.homeinsurance.property.dto.AddressPutRequestDto;
import com.hcl.homeinsurance.property.entity.Address;
import com.hcl.homeinsurance.property.exception.AddressException;
import com.hcl.homeinsurance.property.exception.SaveException;
import com.hcl.homeinsurance.property.exception.UpdationException;
import com.hcl.homeinsurance.property.repository.AddressRepository;
import com.hcl.homeinsurance.property.utility.PropertyUtility;
@Service
public class AddressServiceImpl implements AdressService{
	
	@Autowired
	AddressRepository addressRepository;

	@Override
	public String updateAddress(AddressPutRequestDto addressPutRequestDto) throws UpdationException, AddressException {
	 Optional<Address> address = addressRepository.findById(addressPutRequestDto.getAddressId());
		if (!address.isPresent()) {
			throw new AddressException(PropertyUtility.ADDRESS_ERROR);
			
		} else {
		
		
			if (addressPutRequestDto.getAddress() != null && !addressPutRequestDto.getAddress().isEmpty())
				address.get().setAddress(addressPutRequestDto.getAddress());
			
			if (addressPutRequestDto.getAddressLine2()!= null && !addressPutRequestDto.getAddressLine2().isEmpty())
				address.get().setAddressLine2(addressPutRequestDto.getAddressLine2());
			
			if (addressPutRequestDto.getCity() != null && !addressPutRequestDto.getCity().isEmpty())
				address.get().setCity(addressPutRequestDto.getCity());
			
			if (addressPutRequestDto.getResdienceType() != null && !addressPutRequestDto.getResdienceType().isEmpty())
				address.get().setCity(addressPutRequestDto.getResdienceType());
			
			if (addressPutRequestDto.getResdienceUse() != null && !addressPutRequestDto.getResdienceUse().isEmpty())
				address.get().setResdienceUse(addressPutRequestDto.getResdienceUse());
			
			if (addressPutRequestDto.getState() != null && !addressPutRequestDto.getState().isEmpty())
				address.get().setState(addressPutRequestDto.getState());
			
			if (addressPutRequestDto.getZip() != null && !addressPutRequestDto.getZip().isEmpty())
				address.get().setZip(addressPutRequestDto.getZip());
			
			if (addressRepository.save(address.get()) == null)

				throw new UpdationException(PropertyUtility.UPDATE_ERROR);
				
		}

		return "Updated successfully!";

	}

	@Override
	public AddressPostResponceDto saveAddress(AddressPostRequestDto addressPostRequestDto) throws SaveException {
		Address address = new Address();
		BeanUtils.copyProperties(addressPostRequestDto, address);
		Address address1 = addressRepository.save(address);
		if(address1==null)
		{
			throw new SaveException(PropertyUtility.SAVE_ERROR);
		}
		AddressPostResponceDto addressPostResponceDto=new AddressPostResponceDto();
		addressPostResponceDto.setAddressId(address1.getAddressId());
		addressPostResponceDto.setMessage("address saved Successfully"); 
		addressPostResponceDto.setStatusCode(700);
		
		

		return addressPostResponceDto;
	}

}
