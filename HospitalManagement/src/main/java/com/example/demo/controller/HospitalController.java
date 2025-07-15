package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Hospital;
import com.example.demo.service.HospitalService;

@RestController
public class HospitalController {
	
	 @Autowired
	HospitalService hs;
	
	@PostMapping("addHospital")
	String addHospital(@RequestBody Hospital h)
	{
		hs.saveHospital(h);
	return "Doctor added";
	}
	@DeleteMapping("delete/{id}")
	String deleteHospital(@PathVariable int id )
	{
		hs.deleteHospital(id);
		return "delete Hospital" ;
	}
}
