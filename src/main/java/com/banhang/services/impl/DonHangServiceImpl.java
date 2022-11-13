package com.banhang.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.banhang.entities.DonHangEntity;
import com.banhang.entities.KhachHangEntity;
import com.banhang.entities.SanPhamEntity;
import com.banhang.models.DonHang;
import com.banhang.models.ResponObject;
import com.banhang.repositories.IDonHangRepository;
import com.banhang.repositories.IKhachHangRepository;
import com.banhang.repositories.ISanPhamRepository;
import com.banhang.services.IDonHangService;

@Service
public class DonHangServiceImpl implements IDonHangService {

	@Autowired
	private IDonHangRepository donHangRepository;
	@Autowired
	private IKhachHangRepository khachHangRepository;
	@Autowired
	private ISanPhamRepository sanPhamRepository;

	@Override
	public ResponseEntity<ResponObject> getAllDonHang() {
		// TODO lay danh sach don hang
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Danh sach danh muc",
						donHangRepository.findAll()));
	}

	@Override
	public ResponseEntity<ResponObject> getAllDonHangByTrangThai(boolean trangThai) {
		// TODO lay danh sach don hang theo trang thai
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Danh sach danh muc",
						donHangRepository.findAllByTrangThai(trangThai)));
	}

	@Override
	public ResponseEntity<ResponObject> insertDonHang(DonHang donHang) {
		KhachHangEntity khachHangEntity = khachHangRepository.findById(donHang.getIdKhachHang()).get();
		SanPhamEntity sanPhamEntity = sanPhamRepository.findById(donHang.getIdSanPham()).get();
		DonHangEntity donHangEntity = new DonHangEntity(
				khachHangEntity, 
				sanPhamEntity,
				new Date(),
				false, 
				donHang.getSoLuong());
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Them don hang thanh cong",
						donHangRepository.save(donHangEntity)));
	}

	@Override
	public ResponseEntity<ResponObject> updateDonHang(Long id) {
		// TODO cap nhat trang thai cho don hang
		DonHangEntity donHangEntity = donHangRepository.findById(id).get();
		donHangEntity.setTrangThai(true);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Cap nhat don hang thanh cong",
						donHangRepository.save(donHangEntity)));
	}
	
	
}
