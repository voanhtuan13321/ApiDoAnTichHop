package com.banhang.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banhang.entities.KhachHangEntity;

public interface IKhachHangRepository extends JpaRepository<KhachHangEntity, Long> {

	Optional<KhachHangEntity> findByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);
	
	Optional<KhachHangEntity> findByTaiKhoan(String taiKhoan);
}
