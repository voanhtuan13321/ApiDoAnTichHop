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

import com.banhang.models.ResponObject;
import com.banhang.models.SanPham;
import com.banhang.services.ISanPhamService;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/sanpham")
public class SanPhamController {
	
	@Autowired
	private ISanPhamService sanPhamService;
	
	@GetMapping()
	public ResponseEntity<ResponObject> getAllSanPham() {
		return sanPhamService.getAllSanPham();
	}
	
	@GetMapping(path = "/{id}")
	public ResponseEntity<ResponObject> getSanPhamById(@PathVariable Long id) {
		return sanPhamService.getSanPhamById(id);
	}
	
	@GetMapping(path = "/danhmuc/{id}")
	public ResponseEntity<ResponObject> getSanPhamByIdDanhMuc(@PathVariable Long id) {
		return sanPhamService.getSanPhamByIdDanhMuc(id);
	}
	
	@PutMapping(path = "/timkiem")
	public ResponseEntity<ResponObject> getSanPhamBySearch(@RequestBody String search) {
		return sanPhamService.searchSanPham(search);
	}
	
	@PostMapping
	public ResponseEntity<ResponObject> insertSanPham(@RequestBody SanPham sanPham) {
		return sanPhamService.insertSanPham(sanPham);
	}
	
	@DeleteMapping(path = "/{id}")
	public ResponseEntity<ResponObject> deleteSanPham(@PathVariable Long id) {
		return sanPhamService.deleteSanPham(id);
	}
}
