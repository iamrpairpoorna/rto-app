package com.rto.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rto.model.VehicleOwner;

@Repository
public interface VehicleOwnerRepository<V> extends CrudRepository<VehicleOwner, Integer> {
	
	
	@Query("SELECT  ownerId FROM VehicleOwner WHERE ownerId=(SELECT MAX(ownerId) FROM VehicleOwner)")
	public int findTopByOrderByOwner_idDesc();
	
	/*
	 * @Query("select  from VehicleOwner vo where vo.owner_id= :owner_id") public
	 * VehicleOwner getByOwnerId(int owner_id);
	 */
	
	public VehicleOwner findByOwnerId(Integer ownerId);
}
