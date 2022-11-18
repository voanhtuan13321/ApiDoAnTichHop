package com.banhang.services;

import org.springframework.http.ResponseEntity;

import com.banhang.entities.NhanVienEntity;
import com.banhang.models.NhanVien;
import com.banhang.models.ResponObject;

public interface INhanVienService {

	ResponseEntity<ResponObject> checkLogin(NhanVien nhanVien);

	ResponseEntity<ResponObject> getAllNhanVien();

	ResponseEntity<ResponObject> getNhanVienById(Long id);

	ResponseEntity<ResponObject> insertNhanVien(NhanVienEntity nhanVien);

	ResponseEntity<ResponObject> delelteNhanVien(Long id);

	ResponseEntity<ResponObject> searchNhanVien(String search);

}
