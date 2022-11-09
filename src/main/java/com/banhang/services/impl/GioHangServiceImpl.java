package com.banhang.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.banhang.entities.GioHangEntity;
import com.banhang.entities.KhachHangEntity;
import com.banhang.entities.SanPhamEntity;
import com.banhang.models.GioHang;
import com.banhang.models.ResponObject;
import com.banhang.repositories.IGioHangRepository;
import com.banhang.repositories.IKhachHangRepository;
import com.banhang.repositories.ISanPhamRepository;
import com.banhang.services.IGioHangService;

@Service
public class GioHangServiceImpl implements IGioHangService {

	@Autowired
	private IGioHangRepository gioHangRepository;
	@Autowired
	private ISanPhamRepository sanPhamRepository;
	@Autowired
	private IKhachHangRepository khachHangRepository;

	@Override
	public ResponseEntity<ResponObject> getAllGioHangByIdKhachHang(Long id) {
		// TODO lay san pham theo id cua khach
		KhachHangEntity khachHangEntity = khachHangRepository.findById(id).get();
		
		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK",
						"Danh sach gio hang",
						gioHangRepository.findAllByKhachHang(khachHangEntity)));
	}

	@Override
	public ResponseEntity<ResponObject> insertGioHang(GioHang gioHang) {
		// TODO them san pham
		SanPhamEntity sanPhamEntity = sanPhamRepository.findById(gioHang.getIdSanPham()).get();
		KhachHangEntity khachHangEntity = khachHangRepository.findById(gioHang.getIdKhachHang()).get();
		
		int countBySanPhamAndKhachHang = gioHangRepository.countBySanPhamAndKhachHang(sanPhamEntity, khachHangEntity);
		System.out.println(countBySanPhamAndKhachHang);
		GioHangEntity gioHangEntity;
		if (countBySanPhamAndKhachHang == 0) {
			// them moi
			gioHangEntity = new GioHangEntity();
			gioHangEntity.setKhachHang(khachHangEntity);
			gioHangEntity.setSanPham(sanPhamEntity);
			gioHangEntity.setSoLuong(1);
		} else {
			// tang so luong
			gioHangEntity = gioHangRepository.findBySanPhamAndKhachHang(sanPhamEntity, khachHangEntity).get();
			gioHangEntity.setSoLuong(gioHangEntity.getSoLuong() + 1);
		}

		return ResponseEntity.status(HttpStatus.OK)
				.body(new ResponObject(
						"OK",
						"Cap nhat thang cong",
						gioHangRepository.save(gioHangEntity)));
	}

	@Override
	public ResponseEntity<ResponObject> updateGioHang(GioHang gioHang) {
		// TODO giam so luong
		GioHangEntity gioHangEntity = gioHangRepository.findById(gioHang.getId()).get();
		
		if (gioHangEntity.getSoLuong() == 1) {
			gioHangRepository.deleteById(gioHang.getId());
			return ResponseEntity.status(HttpStatus.OK)
					.body(new ResponObject(
							"OK",
							"Xoa san pham khoi gio hang",
							""));
		} else {
			gioHangEntity.setSoLuong(gioHangEntity.getSoLuong() - 1);
			return ResponseEntity.status(HttpStatus.OK)
					.body(new ResponObject(
							"OK",
							"Cap nhat thang cong",
							gioHangRepository.save(gioHangEntity)));
		}
	}
	
	
}
