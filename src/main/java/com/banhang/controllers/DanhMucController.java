package com.banhang.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banhang.models.DanhMuc;
import com.banhang.models.ResponObject;
import com.banhang.services.IDanhMucService;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/danhmuc")
public class DanhMucController {

	@Autowired
	private IDanhMucService danhMucService;
	
	@GetMapping()
	public ResponseEntity<ResponObject> getAllDanhMuc() {
		return danhMucService.getAllDanhMuc();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<ResponObject> getDanhMucById(@PathVariable Long id) {
		return danhMucService.getDanhMucById(id);
	}
	
	@PostMapping
	public ResponseEntity<ResponObject> insertDanhMuc(@RequestBody DanhMuc danhMuc) {
		return danhMucService.insertDanhMuc(danhMuc);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<ResponObject> deleteDanhMuc(@PathVariable Long id) {
		return danhMucService.deleteDanhMuc(id);
	}
}
