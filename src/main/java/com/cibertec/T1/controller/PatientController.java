package com.cibertec.T1.controller;

import com.cibertec.T1.model.Patient;
import com.cibertec.T1.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {
	
	@Autowired
	PatientService patientService;

	@GetMapping
	public ResponseEntity<List<Patient>> list(){
		return  new ResponseEntity<>(patientService.list(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<Patient> add(@RequestBody Patient o) {
		return new ResponseEntity<>(patientService.add(o), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Patient> update(@RequestBody Patient o) {
		return new ResponseEntity<>(patientService.update(o), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		patientService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
