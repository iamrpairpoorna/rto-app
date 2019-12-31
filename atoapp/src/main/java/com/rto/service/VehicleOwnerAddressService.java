package com.rto.service;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rto.model.VehicleOwnerAddress;
import com.rto.repository.VehicleOwnerAdddressRepository;

@Service
public class VehicleOwnerAddressService {
	
	@Autowired
	VehicleOwnerAdddressRepository var;
	
	
	
	public void saveVehicleOwnerAddress(VehicleOwnerAddress vehicleOwnerAddress) {
		System.out.println("street No in service:"+vehicleOwnerAddress.getOwner_streetNo());
		System.out.println("in the address service:"+vehicleOwnerAddress.getOwnerId());
		var.save(vehicleOwnerAddress);
	}

	public VehicleOwnerAddress getVehicleOwnerAddressByOwnerId(int ownerId) {
		return ((VehicleOwnerAddress)var.findByOwnerId(ownerId));
	}
}
