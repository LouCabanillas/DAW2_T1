package com.cibertec.T1.controller;

import com.cibertec.T1.model.Pharmacy;
import com.cibertec.T1.service.PharmacyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pharmacy")
public class PharmacyController {
	
	@Autowired
	PharmacyService pharmacyService;

	@GetMapping
	public ResponseEntity<List<Pharmacy>> list(){
		return  new ResponseEntity<>(pharmacyService.list(), HttpStatus.OK)  ;
	}

	@PostMapping
	public ResponseEntity<Pharmacy> add(@RequestBody Pharmacy o) {
		return new ResponseEntity<>(pharmacyService.add(o), HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity<Pharmacy> update(@RequestBody Pharmacy o) {
		return new ResponseEntity<>(pharmacyService.update(o), HttpStatus.CREATED);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable("id") Long id) {
		pharmacyService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
