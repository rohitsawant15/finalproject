package com.app.Repository;

import com.app.model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital,Integer> {

    @Query("select h from Hospital h where h.email =: email")
    Hospital findHospitalByEmail(String email);

    @Query("select h from Hospital h where h.id =: hid")
    Hospital findHospitalById(int hid);
    
	@Query("select p from Hospital p where p.hospitalCoordinates=:nearestcoordinates")
    Hospital fetchHospitalByCoordinates(double nearestlatitude);
}
