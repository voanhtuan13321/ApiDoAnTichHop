package com.banhang.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.banhang.entities.KhachHangEntity;
import com.banhang.models.KhachHang;
import com.banhang.models.ResponObject;
import com.banhang.repositories.IKhachHangRepository;
import com.banhang.services.IKhachHangService;

@Service
public class KhachHangServiceImpl implements IKhachHangService {

	@Autowired
	private IKhachHangRepository khachHangRepository;

	@Override
	public ResponseEntity<ResponObject> getKhachHangById(Long id) {
		// TODO lay thong tin tai khoan khach hang theo id
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Tai khoan khach hang can tim",
						khachHangRepository.findById(id).get()));
	}

	@Override
	public ResponseEntity<ResponObject> insertKhachHang(KhachHang khachHang) {
		// TODO them moi hoac cap nhat thong tin khach hang
		KhachHangEntity khachHangEntity;
		
		// truong hop cap nhat
		if (khachHang.getId() != null) {
			khachHangEntity = khachHangRepository.findById(khachHang.getId()).get();
		}
		// truong hop them moi
		else {
			khachHangEntity = new KhachHangEntity();
		}
		
		khachHangEntity.setHoTen(khachHang.getHoTen());
		khachHangEntity.setNgaySinh(khachHang.getNgaySinh());
		khachHangEntity.setSoDienThoai(khachHang.getSoDienThoai());
		khachHangEntity.setCccd(khachHang.getCccd());
		khachHangEntity.setDiaChi(khachHang.getDiaChi());
		khachHangEntity.setTaiKhoan(khachHang.getTaiKhoan());
		khachHangEntity.setMatKhau(khachHang.getMatKhau());
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Cap nhat khach hang thanh cong",
						khachHangRepository.save(khachHangEntity)));
	}

	@Override
	public ResponseEntity<ResponObject> deleteKhachHang(Long id) {
		// TODO xoa khach hang
		khachHangRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Xoa khach hang thanh cong",
						""));
	}

	@Override
	public ResponseEntity<ResponObject> checkDangNhap(KhachHang khachHang) {
		// TODO kiem tra dang nhap
		Optional<KhachHangEntity> foundKhachHang =
				khachHangRepository.findByTaiKhoanAndMatKhau(khachHang.getTaiKhoan(), khachHang.getMatKhau());
		return foundKhachHang.isPresent()
				? ResponseEntity.status(HttpStatus.OK)
						.body(new ResponObject(
								"OK", 
								"Tim thay tai khoan",
								foundKhachHang.get()))
				: ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body(new ResponObject(
								"FAILD", 
								"Khong tim thay thong tin tai khoan khach hang",
								""));
	}
	
}
