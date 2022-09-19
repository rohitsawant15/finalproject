package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.HospitalCoordinates;



public interface HospitalCoordinatesRepository extends JpaRepository<HospitalCoordinates, Integer>{

	
	
}
