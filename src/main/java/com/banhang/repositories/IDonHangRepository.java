package com.banhang.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banhang.entities.DonHangEntity;

public interface IDonHangRepository extends JpaRepository<DonHangEntity, Long> {

	List<DonHangEntity> findAllByTrangThai(boolean trangThai);

}
