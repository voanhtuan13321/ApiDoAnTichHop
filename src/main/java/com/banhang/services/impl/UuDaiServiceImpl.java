package com.banhang.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.banhang.entities.NhanVienEntity;
import com.banhang.entities.UuDaiEntity;
import com.banhang.models.ResponObject;
import com.banhang.models.UuDai;
import com.banhang.repositories.INhanVienRepository;
import com.banhang.repositories.IUuDaiRepository;
import com.banhang.services.IUuDaiService;

@Service
public class UuDaiServiceImpl implements IUuDaiService {

	@Autowired
	private IUuDaiRepository uuDaiRepository;
	@Autowired
	private INhanVienRepository nhanVienRepository;

	@Override
	public ResponseEntity<ResponObject> getAllUuDai() {
		// TODO lay tat ca thong tin cua cac uu dai
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Danh sach uu dai",
						uuDaiRepository.findAll()));
	}

	@Override
	public ResponseEntity<ResponObject> getUuDaiById(Long id) {
		// TODO lay thong tin uu dai theo id
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Thong tin uu dai",
						uuDaiRepository.findById(id).get()));
	}

	@Override
	public ResponseEntity<ResponObject> insertUuDai(UuDai uuDai) {
		// TODO them hoac cap nhat uu dai
		UuDaiEntity uuDaiEntity;
		
		// truong hop cap nhat
		if (uuDai.getId() != null) {
			uuDaiEntity = uuDaiRepository.findById(uuDai.getId()).get();
		}
		// truong hop them moi
		else {
			uuDaiEntity = new UuDaiEntity();
			uuDaiEntity.setNgayTao(new Date());
		}
		
		uuDaiEntity.setTieuDe(uuDai.getTieuDe());
		uuDaiEntity.setNoiDung(uuDai.getNoiDung());
		uuDaiEntity.setNgayCapNhat(new Date());
		NhanVienEntity nhanVienEntity = nhanVienRepository.findById(uuDai.getIdNhanVien()).get();
		uuDaiEntity.setNhanVien(nhanVienEntity);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"cap nhat uu dai",
						uuDaiRepository.save(uuDaiEntity)));
	}

	@Override
	public ResponseEntity<ResponObject> deleteUuDai(Long id) {
		// TODO xoa uu dai theo id
		uuDaiRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Xoa uu dai",
						""));
	}
	
}
