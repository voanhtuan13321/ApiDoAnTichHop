package com.banhang.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.banhang.entities.AdminEntity;
import com.banhang.models.ResponObject;
import com.banhang.repositories.IAdminRepository;
import com.banhang.services.IAdminService;

@Service
public class AdminServiceImpl implements IAdminService {

	@Autowired
	private IAdminRepository adminRepository;

	@Override
	public ResponseEntity<ResponObject> checkLogin(AdminEntity adminEntity) {
		// TODO Auto-generated method stub
		Optional<AdminEntity> foundAdmin = adminRepository.findByTaiKhoanAndMatKhau(adminEntity.getTaiKhoan(), adminEntity.getMatKhau());
		return foundAdmin.isPresent()
				? ResponseEntity.status(HttpStatus.OK)
						.body(new ResponObject("OK", "Dang nhap thanh cong", foundAdmin.get()))
				: ResponseEntity.status(HttpStatus.NOT_FOUND)
						.body(new ResponObject("FAILD", "Dang nhap that bai", ""));
	}
}
