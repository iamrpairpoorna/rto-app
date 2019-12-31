package com.rto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rto.model.Vehicle_details;
import com.rto.repository.VehicleDetialsRepository;

@Service
public class VehicleDetialsService {
	
	@Autowired
	VehicleDetialsRepository vdr;
	
	public void  saveVehicleDetailsService(Vehicle_details vehicle_details) {
		vdr.save(vehicle_details);
	}
	
	public Vehicle_details getVehicleDetailsByOwnerId(int ownerId) {
		return ((Vehicle_details)vdr.findByOwnerId(ownerId));
	}
}
