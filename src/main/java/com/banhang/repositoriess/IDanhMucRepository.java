package com.banhang.repositoriess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banhang.entities.DanhMucEntity;

public interface IDanhMucRepository extends JpaRepository<DanhMucEntity, Long> {

}
