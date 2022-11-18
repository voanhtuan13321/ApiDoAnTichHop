package com.banhang.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.banhang.entities.NhanVienEntity;
import com.banhang.models.NhanVien;
import com.banhang.models.ResponObject;
import com.banhang.repositories.INhanVienRepository;
import com.banhang.services.INhanVienService;

@Service
public class NhanVienServiceImpl implements INhanVienService {

	@Autowired
	private INhanVienRepository nhanVienRepository;

	@Override
	public ResponseEntity<ResponObject> checkLogin(NhanVien nhanVien) {
		// TODO Auto-generated method stub
		Optional<NhanVienEntity> nhanVienEntity = nhanVienRepository.findByTaiKhoanAndMatKhau(nhanVien.getTaiKhoan(), nhanVien.getMatKhau());
		
		return nhanVienEntity.isPresent()
				? ResponseEntity.status(HttpStatus.OK)
						.body(new ResponObject(
								"OK",
								"Ton tai nhan vien",
								nhanVienEntity.get()))
				: ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body(new ResponObject(
								"Faild",
								"Khong ton tai nhan vien",
								""));
	}

	@Override
	public ResponseEntity<ResponObject> getAllNhanVien() {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK",
						"Danh sach nhan vien",
						nhanVienRepository.findAll()));
	}

	@Override
	public ResponseEntity<ResponObject> getNhanVienById(Long id) {
		// TODO Auto-generated method stub
		Optional<NhanVienEntity> foundNhanVien = nhanVienRepository.findById(id);
		return foundNhanVien.isPresent()
				? ResponseEntity.status(HttpStatus.OK)
						.body(new ResponObject(
								"OK",
								"Ton tai nhan vien",
								foundNhanVien.get()))
				: ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body(new ResponObject(
								"Faild",
								"Khong ton tai nhan vien",
								""));
	}

	@Override
	public ResponseEntity<ResponObject> insertNhanVien(NhanVienEntity nhanVien) {
		// TODO Auto-generated method stub
		if (nhanVien.getId() == null) {
			
			if (nhanVienRepository.findByTaiKhoan(nhanVien.getTaiKhoan()).isPresent()) {
				return ResponseEntity.status(HttpStatus.ALREADY_REPORTED)
						.body(new ResponObject(
								"Faild",
								"Tai Khoan trung",
								""));
			}
			
			return ResponseEntity.status(HttpStatus.OK)
					.body(new ResponObject(
							"OK",
							"Them nhan vien",
							nhanVienRepository.save(nhanVien)));
		} else {
			NhanVienEntity nhanVienOld = nhanVienRepository.findById(nhanVien.getId()).get();
			nhanVienOld.setHoTen(nhanVien.getHoTen());
			nhanVienOld.setCccd(nhanVien.getCccd());
			nhanVienOld.setMatKhau(nhanVien.getMatKhau());
			nhanVienOld.setNgaySinh(nhanVien.getNgaySinh());
			nhanVienOld.setSoDienThoai(nhanVien.getSoDienThoai());
			nhanVienOld.setTaiKhoan(nhanVien.getTaiKhoan());
			
			return ResponseEntity.status(HttpStatus.OK)
					.body(new ResponObject(
							"OK",
							"Cap nhat nhan vien",
							nhanVienRepository.save(nhanVienOld)));
		}
	}

	@Override
	public ResponseEntity<ResponObject> delelteNhanVien(Long id) {
		// TODO Auto-generated method stub
		nhanVienRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK",
						"Them nhan vien",
						""));
	}

	@Override
	public ResponseEntity<ResponObject> searchNhanVien(String search) {
		// TODO Auto-generated method stub
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK",
						"Danh sach nhan vien",
						nhanVienRepository.findAllBySearch("%" + search + "%")));
	}
	
}
