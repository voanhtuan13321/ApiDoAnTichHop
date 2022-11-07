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

import com.banhang.models.ResponObject;
import com.banhang.models.KhachHang;
import com.banhang.services.IKhachHangService;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/khachhang")
public class KhachHangController {

	@Autowired
	private IKhachHangService khachHangService;
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<ResponObject> getKhachHangById(@PathVariable Long id) {
		return khachHangService.getKhachHangById(id);
	}
	
	@PostMapping
	public ResponseEntity<ResponObject> insertKhachHang(@RequestBody KhachHang KhachHang) {
		return khachHangService.insertKhachHang(KhachHang);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<ResponObject> deleteKhachHang(@PathVariable Long id) {
		return khachHangService.deleteKhachHang(id);
	}
	
	@GetMapping(path = "/dangnhap")
	public ResponseEntity<ResponObject> checkDangNhap(@RequestBody KhachHang khachHang) {
		return khachHangService.checkDangNhap(khachHang);
	}
}
