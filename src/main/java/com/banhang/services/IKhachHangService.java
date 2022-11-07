package com.banhang.services;

import org.springframework.http.ResponseEntity;

import com.banhang.models.KhachHang;
import com.banhang.models.ResponObject;

public interface IKhachHangService {

	ResponseEntity<ResponObject> getKhachHangById(Long id);

	ResponseEntity<ResponObject> insertKhachHang(KhachHang khachHang);

	ResponseEntity<ResponObject> deleteKhachHang(Long id);

	ResponseEntity<ResponObject> checkDangNhap(KhachHang khachHang);

}
