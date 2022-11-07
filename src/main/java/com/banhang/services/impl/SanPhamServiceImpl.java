package com.banhang.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.banhang.entities.DanhMucEntity;
import com.banhang.entities.NhanVienEntity;
import com.banhang.entities.SanPhamEntity;
import com.banhang.models.ResponObject;
import com.banhang.models.SanPham;
import com.banhang.repositories.IDanhMucRepository;
import com.banhang.repositories.INhanVienRepository;
import com.banhang.repositories.ISanPhamRepository;
import com.banhang.services.ISanPhamService;

@Service
public class SanPhamServiceImpl implements ISanPhamService {

	@Autowired
	private ISanPhamRepository sanPhamRepository;
	@Autowired
	private INhanVienRepository nhanVienRepository;
	@Autowired
	private IDanhMucRepository danhMucRepository;
	
	@Override
	public ResponseEntity<ResponObject> getAllSanPham() {
		// TODO lay toan bo thong tin san pham
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Danh sach san pham",
						sanPhamRepository.findAll()));
	}

	@Override
	public ResponseEntity<ResponObject> getSanPhamById(Long id) {
		// TODO lay san pham theo id
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"San pham",
						sanPhamRepository.findById(id).get()));
	}
	
	@Override
	public ResponseEntity<ResponObject> getSanPhamByIdDanhMuc(Long id) {
		// TODO lay danh sach san pham theo id danh muc
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Danh sach san pham theo danh muc",
						sanPhamRepository.findAllByDanhMuc(id)));
	}

	@Override
	public ResponseEntity<ResponObject> insertSanPham(SanPham sanPham) {
		// TODO them san pham
		SanPhamEntity newSanPhamEntity;
		
		// truong hop tao moi
		if (sanPham.getId() == null) {
			newSanPhamEntity = new SanPhamEntity();
			newSanPhamEntity.setId(sanPham.getId());
			newSanPhamEntity.setNgayThem(new Date());
		}
		// truong hop cap nhat
		else {
			newSanPhamEntity = sanPhamRepository.findById(sanPham.getId()).get();
		}
		
		newSanPhamEntity.setTenSanPham(sanPham.getTenSanPham());
		newSanPhamEntity.setAnh(sanPham.getAnh());
		newSanPhamEntity.setMoTa(sanPham.getMoTa());
		newSanPhamEntity.setGia(sanPham.getGia());
		newSanPhamEntity.setNgayCapNhat(new Date());
		newSanPhamEntity.setTrangThai(true);
		NhanVienEntity nhanVien = nhanVienRepository.findById(sanPham.getIdNhanVien()).get();
		DanhMucEntity danhMuc = danhMucRepository.findById(sanPham.getIdDanhMuc()).get();
		newSanPhamEntity.setNhanVien(nhanVien);
		newSanPhamEntity.setDanhMuc(danhMuc);
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Them san pham thanh cong",
						sanPhamRepository.save(newSanPhamEntity)));
	}

	@Override
	public ResponseEntity<ResponObject> deleteSanPham(Long id) {
		// TODO xoa san pham
		sanPhamRepository.deleteById(id);
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Xoa san pham thanh cong",
						""));
	}

	@Override
	public ResponseEntity<ResponObject> searchSanPham(String searchStr) {
		// TODO tim kiem san pham theo ten va mo ta
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK", 
						"Thom tin san pham",
						sanPhamRepository.findAllBySearch("%" + searchStr + "%")));
	}
	
}
