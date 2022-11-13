package com.banhang.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banhang.models.DonHang;
import com.banhang.models.ResponObject;
import com.banhang.services.IDonHangService;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/donhang")
public class DonHangController {

	@Autowired
	private IDonHangService donHangService;
	
	@GetMapping()
	public ResponseEntity<ResponObject> getAllDonHang() {
		return donHangService.getAllDonHang();
	}
	
	@GetMapping(path = "/{trangThai}")
	public ResponseEntity<ResponObject> getAllDonHangByTrangThai(@PathVariable boolean trangThai) {
		return donHangService.getAllDonHangByTrangThai(trangThai);
	}
	
	@PostMapping()
	public ResponseEntity<ResponObject> insertDonHang(@RequestBody DonHang donHang) {
		return donHangService.insertDonHang(donHang);
	}
	
	@PutMapping(path = "/{id}")
	public ResponseEntity<ResponObject> updateDonHang(@PathVariable Long id) {
		return donHangService.updateDonHang(id);
	}
}
