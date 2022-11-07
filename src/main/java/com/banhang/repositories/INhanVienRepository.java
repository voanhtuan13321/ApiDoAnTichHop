package com.banhang.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banhang.entities.NhanVienEntity;

public interface INhanVienRepository extends JpaRepository<NhanVienEntity, Long> {

}
