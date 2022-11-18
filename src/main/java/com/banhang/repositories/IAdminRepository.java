package com.banhang.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banhang.entities.AdminEntity;

public interface IAdminRepository extends JpaRepository<AdminEntity, Long> {

	Optional<AdminEntity> findByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);
}
