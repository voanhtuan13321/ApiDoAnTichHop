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

import com.banhang.entities.NhanVienEntity;
import com.banhang.models.NhanVien;
import com.banhang.models.ResponObject;
import com.banhang.services.INhanVienService;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/nhanvien")
public class NhanVienController {

	@Autowired
	private INhanVienService nhanVienService;
	
	@PutMapping(path = "/login")
	public ResponseEntity<ResponObject> checkDangNhap(@RequestBody NhanVien nhanVien) {
		return nhanVienService.checkLogin(nhanVien);
	}
	
	@GetMapping
	public ResponseEntity<ResponObject> getAllNhanVien() {
		return nhanVienService.getAllNhanVien();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<ResponObject> getNhanVienById(@PathVariable Long id) {
		return nhanVienService.getNhanVienById(id);
	}
	
	@PostMapping
	public ResponseEntity<ResponObject> insertNhanVien(@RequestBody NhanVienEntity nhanVien) {
		return nhanVienService.insertNhanVien(nhanVien);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<ResponObject> delelteNhanVien(@PathVariable Long id) {
		return nhanVienService.delelteNhanVien(id);
	}
	
	@PostMapping(path = "/timkiem")
	public ResponseEntity<ResponObject> searchNhanVien(@RequestBody String search) {
		return nhanVienService.searchNhanVien(search);
	}
}
