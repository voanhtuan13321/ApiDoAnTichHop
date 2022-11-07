package com.banhang.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.banhang.entities.DanhMucEntity;
import com.banhang.models.DanhMuc;
import com.banhang.models.ResponObject;
import com.banhang.repositoriess.IDanhMucRepository;
import com.banhang.services.IDanhMucService;

@Service
public class DanhMucServiceImpl implements IDanhMucService {

	@Autowired
	private IDanhMucRepository danhMucRepository;

	@Override
	public ResponseEntity<ResponObject> getAllDanhMuc() {
		// TODO lay toan bo thong tin danh muc
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Danh sach danh muc",
						danhMucRepository.findAll()));
	}

	@Override
	public ResponseEntity<ResponObject> getDanhMucById(Long id) {
		// TODO lay danh muc theo id
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Danh muc can tim",
						danhMucRepository.findById(id).get()));
	}

	@Override
	public ResponseEntity<ResponObject> insertDanhMuc(DanhMuc danhMuc) {
		// TODO them danh muc
		DanhMucEntity newDanhMuc;
		
		// truong hop them moi
		if (danhMuc.getId() == null) {
			newDanhMuc = new DanhMucEntity();
		}
		// truong hop cap nhat
		else {
			newDanhMuc = danhMucRepository.findById(danhMuc.getId()).get();
		}
		newDanhMuc.setTenDanhMuc(danhMuc.getTenDanhMuc());
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Danh sach danh muc",
						danhMucRepository.save(newDanhMuc)));
	}

	@Override
	public ResponseEntity<ResponObject> deleteDanhMuc(Long id) {
		// TODO xoa danh muc
		danhMucRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Xoa danh muc",
						""));
	}
	
	
}
