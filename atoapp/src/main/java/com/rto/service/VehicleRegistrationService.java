package com.rto.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rto.model.VehicleRegistrationDetails;
import com.rto.repository.VehicleRegistrationRepository;

@Service
public class VehicleRegistrationService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(VehicleRegistrationService.class);
	@Autowired
	VehicleRegistrationRepository vrr;
	
	public void saveVehicleRegistrationDetails(VehicleRegistrationDetails vrd) {
		vrr.save(vrd);
	}

	
	public VehicleRegistrationDetails getByVehicleRegistrationDetailsByOwnerId(int ownerId) {
		return vrr.findByOwnerId(ownerId);
	}

	public int findOwnerIdByRegnNum(String regnNum) {
		LOGGER.info("Request from rest controller to find OwnerId by Registration No.:{}",regnNum);
		LOGGER.info("OwnerID  vehicle Registration No: {}",vrr.findOwnerIdByRegnNum(regnNum));
		return vrr.findOwnerIdByRegnNum(regnNum);
	}
}
