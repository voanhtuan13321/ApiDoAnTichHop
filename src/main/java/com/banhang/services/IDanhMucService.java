package com.banhang.services;

import org.springframework.http.ResponseEntity;

import com.banhang.models.DanhMuc;
import com.banhang.models.ResponObject;

public interface IDanhMucService {

	ResponseEntity<ResponObject> getAllDanhMuc();

	ResponseEntity<ResponObject> getDanhMucById(Long id);

	ResponseEntity<ResponObject> insertDanhMuc(DanhMuc danhMuc);

	ResponseEntity<ResponObject> deleteDanhMuc(Long id);

}
