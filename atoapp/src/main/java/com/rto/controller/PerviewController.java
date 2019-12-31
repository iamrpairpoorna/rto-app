package com.rto.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rto.model.PerviewModel;
import com.rto.model.VehicleOwnerAddress;
import com.rto.model.VehicleRegistrationDetails;
import com.rto.repository.VehicleOwnerRepository;
import com.rto.service.VehicleDetialsService;
import com.rto.service.VehicleOwnerAddressService;
import com.rto.service.VehicleOwnerService;
import com.rto.service.VehicleRegistrationService;

@Controller
public class PerviewController {
	private static final Logger LOGGER = LoggerFactory.getLogger(PerviewController.class);
	@Autowired
	VehicleOwnerService vos;
	
	@Autowired
	VehicleOwnerAddressService voas;
	
	@Autowired
	VehicleDetialsService vds;
	
	@Autowired
	VehicleRegistrationService vrs;

		
		@RequestMapping(value="/previewPage")
		public String previewPage(Model model) {
			 LOGGER.info("in the start of perview method");
			PerviewModel pm = new PerviewModel();
			pm.setVehicleOwner(vos.getByOwnerDetailsByOwnerId(vos.getLastId()));
			pm.setVehicleOwnerAddress(voas.getVehicleOwnerAddressByOwnerId(vos.getLastId()));
			pm.setVehicle_details(vds.getVehicleDetailsByOwnerId(vos.getLastId()));
			
		/*
		 * System.out.println("name="+pm.getVehicleOwner().getOwner_fname());
		 * System.out.println("city="+pm.getVehicleOwnerAddress().getOwner_city());
		 * System.out.println("vehicle="+pm.getVehicle_details().getVehicle_company());
		 */
			LOGGER.info("Retrieved Owner,Vehicle,Registration details and added to model attribute");
			model.addAttribute("o",pm.getVehicleOwner());
			model.addAttribute("od", pm.getVehicleOwnerAddress());
			model.addAttribute("vd", pm.getVehicle_details());
			
			
			return "preview";
		}
		
		 public String getAlphaNumericString(int n) 
		    { 
		        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
		        StringBuilder sb = new StringBuilder(n); 
		  	        for (int i = 0; i < n; i++) { 
		            int index 
		                = (int)(AlphaNumericString.length() 
		                        * Math.random()); 
		            sb.append(AlphaNumericString.charAt(index)); 
		        } 
		         return sb.toString(); 
		    }
		
		/*
		 * public int getLatestRecordId() { String sql =
		 * "select owner_id from vehicle_owner_details order by owner_id desc limit 1;";
		 * int owner_id = (int) template.queryForObject(sql, Integer.class); return
		 * owner_id; }
		 */
		 
		 
		@RequestMapping(params="gen_regn",path="/finalStep")
		public String finalPage(Model m) {
			VehicleRegistrationDetails vrd = new VehicleRegistrationDetails();
			String twoChars = getAlphaNumericString(2);
			String threeChars=getAlphaNumericString(3);
			int id = vos.getLastId();
			String ide;
			if(id<10)
				ide="00"+id;
			else 
				ide = "0"+id;
			
			String regNum = twoChars+ide+threeChars;
			vrd.setRegnNum(regNum);
			vrd.setOwner_id(vos.getLastId());
			m.addAttribute("regNum", regNum);
			vrd.setOwner_id(vos.getLastId());
			vrd.setRegnNum(regNum);
			vrs.saveVehicleRegistrationDetails(vrd);
			return "finalPage";
		}
		
		@RequestMapping(params = "previous_p")
		public String previousPreview(Model model) {
			return "edit_vehicle";
		}
	}

