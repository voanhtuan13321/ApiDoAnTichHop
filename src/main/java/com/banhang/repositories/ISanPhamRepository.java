package com.banhang.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banhang.entities.SanPhamEntity;

public interface ISanPhamRepository extends JpaRepository<SanPhamEntity, Long> {

	@Query(value = "select * from sanpham where iddanhmuc = ?1", nativeQuery = true)
	List<SanPhamEntity> findAllByDanhMuc(Long idDanhMuc);

	@Query(value = "select * from sanpham where tensanpham like ?1 or mota like ?1", nativeQuery = true)
	List<SanPhamEntity> findAllBySearch(String searchStr);

}
