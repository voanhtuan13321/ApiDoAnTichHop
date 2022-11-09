package com.banhang.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.banhang.entities.GioHangEntity;
import com.banhang.entities.KhachHangEntity;
import com.banhang.entities.SanPhamEntity;

public interface IGioHangRepository extends JpaRepository<GioHangEntity, Long> {

	List<GioHangEntity> findAllByKhachHang(KhachHangEntity khachHangEntity);
	
	int countBySanPhamAndKhachHang(SanPhamEntity sanPhamEntity, KhachHangEntity khachHangEntity);

	Optional<GioHangEntity> findBySanPhamAndKhachHang(SanPhamEntity sanPhamEntity, KhachHangEntity khachHangEntity);
	
}
