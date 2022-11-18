package com.banhang.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.banhang.entities.NhanVienEntity;

public interface INhanVienRepository extends JpaRepository<NhanVienEntity, Long> {

	Optional<NhanVienEntity> findByTaiKhoanAndMatKhau(String taiKhoan, String matKhau);

	Optional<NhanVienEntity> findByTaiKhoan(String taiKhoan);
	
	@Query(value = "select * from nhanvien where hoten like ?1", nativeQuery = true)
	List<NhanVienEntity> findAllBySearch(String search);
}
