package com.rto.controller;

import java.io.FileNotFoundException;

import org.apache.coyote.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.Http2;
import org.springframework.boot.web.server.WebServerException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rto.model.PerviewModel;
import com.rto.service.VehicleDetialsService;
import com.rto.service.VehicleOwnerAddressService;
import com.rto.service.VehicleOwnerService;
import com.rto.service.VehicleRegistrationService;

import io.swagger.annotations.ApiOperation;
import javassist.NotFoundException;

@RequestMapping("/api")
@RestController
public class SearchVehicleRestController {

	private static final Logger LOGGER = LoggerFactory.getLogger(SearchVehicleRestController.class);

	@Autowired
	VehicleOwnerService vos;

	@Autowired
	VehicleOwnerAddressService voas;

	@Autowired
	VehicleDetialsService vds;

	@Autowired
	VehicleRegistrationService vrs;

	@ApiOperation(value = "Find by Vehicle Registration Number", notes = "Provides complete Owner and Vehicle Details", response = PerviewModel.class)
	@RequestMapping(value = "/vehicleNo", method = RequestMethod.GET, produces = "application/json")
	public PerviewModel getVehicleOwnerDetailsByVehicleNo(@RequestParam("regnNum") String regnNum) {
		LOGGER.debug("Recieved Rest Client Request for Vehicle Rgistration No:{}", regnNum);
		int ownerId = vrs.findOwnerIdByRegnNum(regnNum);
		PerviewModel pm = new PerviewModel();
		if (ownerId > 0) {
			LOGGER.info("Retreived OwnerId for given Vehicle Registration No:{}", ownerId);
			pm.setVehicleOwner(vos.getByOwnerDetailsByOwnerId(ownerId));
			pm.setVehicleOwnerAddress(voas.getVehicleOwnerAddressByOwnerId(ownerId));
			pm.setVehicle_details(vds.getVehicleDetailsByOwnerId(ownerId));
			pm.setDetails(vrs.getByVehicleRegistrationDetailsByOwnerId(ownerId));
			LOGGER.info("Packed all details in Perview Model Object and sending as a response");
			return pm;
		} else {
			LOGGER.info("No Record found for Vehicle Registration No:{}", regnNum);
			throw new WebServerException("No Record Found", new FileNotFoundException());
		}
	}

	/*
	 * @RequestMapping(value="/vehicleNo",method=RequestMethod.GET,produces =
	 * "application/json") public String
	 * getVehicleOwnerDetailsByVehicleNo(@RequestParam("regnNum") String regnNum) {
	 * int ownerId = vrs.findRegnNumByOwnerId(regnNum); PerviewModel pm = new
	 * PerviewModel(); pm.setVehicleOwner(vos.getByOwnerDetailsByOwnerId(ownerId));
	 * pm.setVehicleOwnerAddress(voas.gtVehicleOwnerAddressByOwnerId(ownerId));
	 * pm.setVehicle_details(vds.getVehicleDetailsByOwnerId(ownerId));
	 * pm.setDetails(vrs.getByVehicleRegistrationDetailsByOwnerId(ownerId)); return
	 * pm.getVehicleOwner().getOwner_fname(); }
	 */
}
