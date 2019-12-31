package com.rto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.rto.model.VehicleOwnerAddress;
import com.rto.service.VehicleOwnerAddressService;
import com.rto.service.VehicleOwnerService;


@Controller
public class VehicleOwnerAddressController {
	
	@Autowired
	VehicleOwnerAddressService voas;
	
	@Autowired
	VehicleOwnerService vos;
	
	@RequestMapping("/enterAddress")
	public String vehicleOwnerAddressForm() {
		return "address";
	}
	
	@RequestMapping(value ="/storeOwnerAddress",method = RequestMethod.POST)
	public String saveVehicleOwnerAddress(VehicleOwnerAddress vehicleOwnerAddress) {
		int owner_id = vos.getLastId();
		System.out.println("in the address controller:"+owner_id);
		vehicleOwnerAddress.setOwnerId(owner_id);
		voas.saveVehicleOwnerAddress(vehicleOwnerAddress);
		return "vehicle";
	}

}
