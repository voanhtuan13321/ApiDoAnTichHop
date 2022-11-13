package com.banhang.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "donhang")
public class DonHangEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "idkhachhang")
	private KhachHangEntity khachHang;

	@ManyToOne
	@JoinColumn(name = "idsanpham")
	private SanPhamEntity sanPham;

	@Column(name = "ngaydat", columnDefinition = "datetime")
	private Date ngayDat;

	@Column(name = "trangthai")
	private boolean trangThai;

	@Column(name = "soluong")
	private int soLuong;

	public DonHangEntity() {
		super();
	}

	public DonHangEntity(KhachHangEntity khachHang, SanPhamEntity sanPham, Date ngayDat, boolean trangThai,
			int soLuong) {
		super();
		this.khachHang = khachHang;
		this.sanPham = sanPham;
		this.ngayDat = ngayDat;
		this.trangThai = trangThai;
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

	public Date getNgayDat() {
		return ngayDat;
	}

	public void setNgayDat(Date ngayDat) {
		this.ngayDat = ngayDat;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}
