package com.banhang.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banhang.entities.AdminEntity;
import com.banhang.models.ResponObject;
import com.banhang.services.IAdminService;

@CrossOrigin
@RestController
@RequestMapping(path = "/api/v1/admin")
public class AdminController {

	@Autowired
	private IAdminService adminService;
	
	@PostMapping(path = "")
	public ResponseEntity<ResponObject> checkLogin(@RequestBody AdminEntity adminEntity) {
		return adminService.checkLogin(adminEntity);
	}
}
