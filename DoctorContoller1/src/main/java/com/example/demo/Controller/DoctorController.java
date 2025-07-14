package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Doctor;

@RestController
public class DoctorController {
	
	@PostMapping("add")
	public String addDoctor(@RequestBody Doctor d) {
		return d.getName()+ "is added";
	}

	@GetMapping("View")
	Doctor ViewDoctor() {
		Doctor d = new Doctor();
		d.setName("John");
		d.setAddress("Pune");
		d.setExperience(8);
		return d;

	}
}
