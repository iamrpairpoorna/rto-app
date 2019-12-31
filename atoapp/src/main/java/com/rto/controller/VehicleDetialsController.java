package com.rto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rto.model.Vehicle_details;
import com.rto.service.VehicleDetialsService;
import com.rto.service.VehicleOwnerService;

@Controller
public class VehicleDetialsController {
	
	@Autowired
	VehicleDetialsService vds;
	
	@Autowired
	VehicleOwnerService vos;
	
	@RequestMapping("/storeVehicleDetails")
	public String saveVehicleDetials(Vehicle_details vehicle_details) {
		vehicle_details.setOwnerId(vos.getLastId());
		vds.saveVehicleDetailsService(vehicle_details);
		return "redirect:/previewPage";
	}

}
