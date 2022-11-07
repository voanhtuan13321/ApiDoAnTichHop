package com.banhang.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "giohang")
public class GioHangEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "idkhachhang")
	private KhachHangEntity khachHang;
	
	@ManyToOne
	@JoinColumn(name = "idsanpham")
	private SanPhamEntity sanPham;
	
	@Column(name = "soluong")
	private int soLuong;

	public GioHangEntity() {
		super();
	}

	public GioHangEntity(KhachHangEntity khachHang, SanPhamEntity sanPham, int soLuong) {
		super();
		this.khachHang = khachHang;
		this.sanPham = sanPham;
		this.soLuong = soLuong;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public KhachHangEntity getKhachHang() {
		return khachHang;
	}

	public void setKhachHang(KhachHangEntity khachHang) {
		this.khachHang = khachHang;
	}

	public SanPhamEntity getSanPham() {
		return sanPham;
	}

	public void setSanPham(SanPhamEntity sanPham) {
		this.sanPham = sanPham;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}
