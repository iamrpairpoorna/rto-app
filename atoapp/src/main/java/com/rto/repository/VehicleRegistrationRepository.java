package com.rto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rto.model.VehicleRegistrationDetails;

@Repository
public interface VehicleRegistrationRepository extends CrudRepository<VehicleRegistrationDetails, Integer>{

	@Query("select v.ownerId from VehicleRegistrationDetails v where v.regnNum = :regnNum")
	public int findOwnerIdByRegnNum(String regnNum);

	public VehicleRegistrationDetails findByOwnerId(int ownerId);
}
