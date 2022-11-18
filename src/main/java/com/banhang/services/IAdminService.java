package com.banhang.services;

import org.springframework.http.ResponseEntity;

import com.banhang.entities.AdminEntity;
import com.banhang.models.ResponObject;

public interface IAdminService {

	ResponseEntity<ResponObject> checkLogin(AdminEntity adminEntity);

}
