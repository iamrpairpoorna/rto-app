package com.rto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.rto.model.VehicleOwner;
import com.rto.repository.VehicleOwnerRepository;

@Service
public class VehicleOwnerService {
	
	
	@Autowired
	VehicleOwnerRepository<VehicleOwner> vehicleOwnerRepo;
	
	@Transactional
	public void saveVehicleOwner(VehicleOwner vehicleOwner) {
		System.out.println("in owner service:"+vehicleOwner.getOwner_fname());
		vehicleOwnerRepo.save(vehicleOwner);
	}
	
	public int getLastId() {
		return vehicleOwnerRepo.findTopByOrderByOwner_idDesc();
	}

	public VehicleOwner getByOwnerDetailsByOwnerId(int ownerId) {
		return (VehicleOwner)vehicleOwnerRepo.findByOwnerId(ownerId);
	}
}
