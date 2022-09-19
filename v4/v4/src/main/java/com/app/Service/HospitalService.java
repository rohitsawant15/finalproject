package com.app.Service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Repository.AccidentRepository;
import com.app.Repository.HospitalCoordinatesRepository;
import com.app.Repository.HospitalRepository;
import com.app.Repository.PoliceStationRepository;
import com.app.Repository.StationCoordinatesRepository;
import com.app.model.Addresses;
import com.app.model.Hospital;
import com.app.model.HospitalCoordinates;



@Service

public class HospitalService {
	
	@Autowired
	private PoliceStationRepository policeStationRepository;
	@Autowired
	private StationCoordinatesRepository stationCoordinatesRepository;
	@Autowired
	private AccidentRepository accidentRepository;
	@Autowired
	private HospitalRepository hospitalRepository;
	@Autowired
	private HospitalCoordinatesRepository hospitalCoordinatesRepository;
	
	
	public String processFirstLogin(Hospital h, byte[] imageFile, String cpassword, HospitalCoordinates coordinates) {
		Hospital hospital = hospitalRepository.findHospitalById(h.getId());
		hospital.setImage(imageFile);
		hospital.setPassword(cpassword);
		hospital.setHospitalCoordinates(coordinates);
		hospital.setStatus("Active");
		return "User First Login Success";
	}

	public String updateHospital(String hospital_name, String mobile, String alt_mobile, String email,
			Addresses address, Hospital h) {
		Hospital hs = hospitalRepository.findHospitalById(h.getId());
		hs.setEmail(email);
		hs.setAltMobile(alt_mobile);
		hs.setMobile(mobile);
		hs.setName(hospital_name);
		hs.setHospitalAddress(address);
		return "Profile Updated";
	}
	
	public String changePassword(Integer id, String npassword) {
		Hospital h = hospitalRepository.findHospitalById(id);
		h.setPassword(npassword);
		return "Password Changed Successfully";
	}
	
}
