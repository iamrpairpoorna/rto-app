package com.rto.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "This class gives all details of Vehicle and Owner")
public class PerviewModel {
	@ApiModelProperty(value = "Provides Vehicle Owner Details")
	private VehicleOwner vehicleOwner;
	@ApiModelProperty(value = "Provides Vehicle Owner Address Details")
	private VehicleOwnerAddress vehicleOwnerAddress;
	@ApiModelProperty(value = "Provides Vehicle Details")
	private Vehicle_details vehicle_details;
	@ApiModelProperty(value = "Provides Vehicle Registration Details")
	private VehicleRegistrationDetails details;
	
	
	public VehicleOwner getVehicleOwner() {
		return vehicleOwner;
	}
	public void setVehicleOwner(VehicleOwner vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}
	public VehicleOwnerAddress getVehicleOwnerAddress() {
		return vehicleOwnerAddress;
	}
	public void setVehicleOwnerAddress(VehicleOwnerAddress vehicleOwnerAddress) {
		this.vehicleOwnerAddress = vehicleOwnerAddress;
	}
	public Vehicle_details getVehicle_details() {
		return vehicle_details;
	}
	public void setVehicle_details(Vehicle_details vehicle_details) {
		this.vehicle_details = vehicle_details;
	}
	public VehicleRegistrationDetails getDetails() {
		return details;
	}
	public void setDetails(VehicleRegistrationDetails details) {
		this.details = details;
	}
	
	

}
