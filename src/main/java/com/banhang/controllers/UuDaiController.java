package com.banhang.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banhang.models.UuDai;
import com.banhang.models.ResponObject;
import com.banhang.services.IUuDaiService;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/uudai")
public class UuDaiController {

	@Autowired
	private IUuDaiService uuDaiService;
	
	@GetMapping()
	public ResponseEntity<ResponObject> getAllUuDai() {
		return uuDaiService.getAllUuDai();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<ResponObject> getUuDaiById(@PathVariable Long id) {
		return uuDaiService.getUuDaiById(id);
	}
	
	@PostMapping
	public ResponseEntity<ResponObject> insertUuDai(@RequestBody UuDai UuDai) {
		return uuDaiService.insertUuDai(UuDai);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<ResponObject> deleteUuDai(@PathVariable Long id) {
		return uuDaiService.deleteUuDai(id);
	}
}
