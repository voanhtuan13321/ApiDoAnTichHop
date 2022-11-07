package com.banhang.services;

import org.springframework.http.ResponseEntity;

import com.banhang.models.ResponObject;
import com.banhang.models.UuDai;

public interface IUuDaiService {

	ResponseEntity<ResponObject> getAllUuDai();

	ResponseEntity<ResponObject> getUuDaiById(Long id);

	ResponseEntity<ResponObject> insertUuDai(UuDai uuDai);

	ResponseEntity<ResponObject> deleteUuDai(Long id);

}
