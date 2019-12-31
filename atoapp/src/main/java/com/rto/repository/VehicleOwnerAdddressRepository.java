package com.rto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rto.model.VehicleOwnerAddress;

@Repository
public interface VehicleOwnerAdddressRepository extends CrudRepository<VehicleOwnerAddress, Integer>{

	/*
	 * @Query("select va.owner_address_id,va.owner_hno,va.owner_streetNo,va.owner_city,va.owner_state,va.owner_zip,va.owner_id from VehicleOwnerAddress va where va.owner_id = :owner_id"
	 * ) VehicleOwnerAddress getVehicleOwnerAddressByOwnerId(int owner_id);
	 */
	
	public VehicleOwnerAddress findByOwnerId(int ownerId);
}
