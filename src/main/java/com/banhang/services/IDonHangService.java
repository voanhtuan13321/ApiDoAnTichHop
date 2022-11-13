package com.banhang.services;

import org.springframework.http.ResponseEntity;

import com.banhang.models.DonHang;
import com.banhang.models.ResponObject;

public interface IDonHangService {

	ResponseEntity<ResponObject> getAllDonHang();

	ResponseEntity<ResponObject> getAllDonHangByTrangThai(boolean trangThai);

	ResponseEntity<ResponObject> insertDonHang(DonHang donHang);

	ResponseEntity<ResponObject> updateDonHang(Long id);

}
