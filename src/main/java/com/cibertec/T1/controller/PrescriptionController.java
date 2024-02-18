package com.cibertec.T1.controller;

import com.cibertec.T1.model.Patient;
import com.cibertec.T1.model.Prescription;
import com.cibertec.T1.service.PatientService;
import com.cibertec.T1.service.PrescriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/prescription")
public class PrescriptionController {
	
	@Autowired
	PrescriptionService prescriptionService;

	@GetMapping
	public ResponseEntity<List<Prescription>> list(){
		return  new ResponseEntity<>(prescriptionService.list(), HttpStatus.OK)  ;
	}
	
	@PostMapping
	public ResponseEntity<Prescription> add(@RequestBody Prescription o) {
		return new ResponseEntity<>(prescriptionService.add(o), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Prescription> update(@RequestBody Prescription o) {
		return new ResponseEntity<>(prescriptionService.update(o), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		prescriptionService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
