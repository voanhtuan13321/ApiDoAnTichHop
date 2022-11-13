package com.banhang.models;

import java.util.Date;

public class DonHang {

	private Long id;
	private Long idKhachHang;
	private Long idSanPham;
	private Date ngayDat;
	private boolean trangThai;
	private int soLuong;

	public DonHang() {
		super();
	}

	public DonHang(Long idKhachHang, Long idSanPham, Date ngayDat, boolean trangThai, int soLuong) {
		super();
		this.idKhachHang = idKhachHang;
		this.idSanPham = idSanPham;
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

	public Long getIdKhachHang() {
		return idKhachHang;
	}

	public void setIdKhachHang(Long idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public Long getIdSanPham() {
		return idSanPham;
	}

	public void setIdSanPham(Long idSanPham) {
		this.idSanPham = idSanPham;
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
