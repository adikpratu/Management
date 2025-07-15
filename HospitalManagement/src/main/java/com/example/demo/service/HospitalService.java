package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Hospital;
import com.example.demo.reposetory.HospitalRepo;

@Service
public class HospitalService {
	
	@Autowired
	HospitalRepo hr;
	public void saveHospital(Hospital h)
	
	{
		hr.save(h);
	
	}
	
	
	public void deleteHospital(int id) {
		hr.deleteById(id);
	}
}
