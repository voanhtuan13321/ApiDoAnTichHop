package com.banhang.services;

import org.springframework.http.ResponseEntity;

import com.banhang.models.ResponObject;
import com.banhang.models.SanPham;

public interface ISanPhamService {

	ResponseEntity<ResponObject> getAllSanPham();

	ResponseEntity<ResponObject> getSanPhamById(Long id);
	
	ResponseEntity<ResponObject> getSanPhamByIdDanhMuc(Long id);

	ResponseEntity<ResponObject> insertSanPham(SanPham sanPham);

	ResponseEntity<ResponObject> deleteSanPham(Long id);

	ResponseEntity<ResponObject> searchSanPham(String searchStr);

}
