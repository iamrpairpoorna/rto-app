package com.rto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rto.model.Vehicle_details;

@Repository
public interface VehicleDetialsRepository extends CrudRepository<Vehicle_details, Integer>{

	/*
	 * @Query("select vd.owner_id,vd.resgnDate,vd.vehicle_company,vd.vehicle_type,vd. vehicle_year from Vehicle_details vd where vd.owner_id = :owner_id"
	 * ) Vehicle_details getVehicleDetailsByOwnerId(int owner_id);
	 */
	
	public Vehicle_details findByOwnerId(int ownerId);
}
