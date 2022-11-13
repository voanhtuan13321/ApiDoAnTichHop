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

import com.banhang.models.GioHang;
import com.banhang.models.ResponObject;
import com.banhang.services.IGioHangService;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/giohang")
public class GioHangController {

	@Autowired
	private IGioHangService gioHangService;
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<ResponObject> getAllGioHangByIdKhachHang(@PathVariable Long id) {
		return gioHangService.getAllGioHangByIdKhachHang(id);
	}
	
	@PostMapping()
	public ResponseEntity<ResponObject> insertGioHang(@RequestBody GioHang gioHang) {
		return gioHangService.insertGioHang(gioHang);
	}
	
	@PutMapping()
	public ResponseEntity<ResponObject> updateGioHang(@RequestBody GioHang gioHang) {
		return gioHangService.updateGioHang(gioHang);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<ResponObject> deleteGioHang(@PathVariable Long id) {
		return gioHangService.deleteGioHang(id);
	}
}
