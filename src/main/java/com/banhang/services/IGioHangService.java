package com.banhang.services;

import org.springframework.http.ResponseEntity;

import com.banhang.models.GioHang;
import com.banhang.models.ResponObject;

public interface IGioHangService {

	ResponseEntity<ResponObject> getAllGioHangByIdKhachHang(Long id);

	ResponseEntity<ResponObject> insertGioHang(GioHang gioHang);

	ResponseEntity<ResponObject> updateGioHang(GioHang gioHang);

	ResponseEntity<ResponObject> deleteGioHang(Long id);

}
