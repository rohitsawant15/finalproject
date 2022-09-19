package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.StationCoordinates;


public interface StationCoordinatesRepository extends JpaRepository<StationCoordinates, Integer>{
	
	
}
