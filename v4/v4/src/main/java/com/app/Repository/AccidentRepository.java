package com.app.Repository;

import com.app.model.Accidents;
import com.app.model.User;
import com.app.model.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccidentRepository extends JpaRepository<Accidents,Integer> {

    @Query("select a from Accidents a where a.username=:username")
    List<Accidents> fetchMyAccident(String username);

    @Query("select a from Accidents a where a.id = ?1")
    Accidents findAccidentById(int aid);
    
    @Query("select a from Accidents a where a.nearestPoliceStation=:p")
    List<Accidents> fetchlistAccidentsById(int p);
}
