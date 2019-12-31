package com.rto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.rto.model.VehicleOwner;
import com.rto.service.VehicleOwnerService;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class VehicleOwnerController {
	@Autowired
	VehicleOwnerService vehicleOwnerService;

	@RequestMapping("/registerUser")
	public String register() {
		return "register";
	}

	@RequestMapping(value = "/storeOwnerDetails", method = RequestMethod.POST)
	public String owner_details(VehicleOwner vehicleOwner,HttpServletRequest request) {
		/*
		 * HttpSession session = request.getSession(); session.setAttribute("owner_id",
		 * vehicleOwner.get);
		 */
		System.out.println("in owner controller:" + vehicleOwner.getOwner_fname());
		vehicleOwner.setOwner_ssn(vehicleOwner.getOwner_ssn().replace(",", ""));
		
		vehicleOwnerService.saveVehicleOwner(vehicleOwner);
		return "redirect:/enterAddress";
	}

	/*
	 * @RequestMapping(path="/editOwnerDetails", method = RequestMethod.POST) public
	 * String edit_owner_details(VehicleOwner vehicleOwner) {
	 * 
	 * 
	 * return "address"; }
	 */ /*
		 * @RequestMapping("/viewpage") public String viewTraveller(Model model) {
		 * List<Owner> list = tDao.getAllTravellars(); model.addAttribute("list",list);
		 * return "displayAll"; }
		 */
}
