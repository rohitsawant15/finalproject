package com.app.Repository;

import com.app.model.Hospital;
import com.app.model.PoliceStation;
import com.app.model.StationCoordinates;
import com.app.model.User;
import com.app.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliceStationRepository extends JpaRepository<PoliceStation,Integer> {

    @Query("select p from PoliceStation p where p.email =: email  and p.password=:password")
    PoliceStation findPoliceStationByEmail(String email,String password);

    @Query("select p from PoliceStation p where p.id =: hid")
    PoliceStation findPoliceStationById(int hid);
    
    @Query("select p from PoliceStation p where p.coordinates=:nearestcoordinates")
    PoliceStation findPoliceStationByCoordinates(StationCoordinates nearestcordinates);
    
    
	}
