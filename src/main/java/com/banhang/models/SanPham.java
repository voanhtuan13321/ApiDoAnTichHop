package com.banhang.models;

import java.util.Date;

public class SanPham {

	private Long id;
	private String tenSanPham;
	private String anh;
	private String moTa;
	private int gia;
	private Date ngayThem;
	private Date ngayCapNhat;
	private boolean trangThai;
	private Long idNhanVien;
	private Long idDanhMuc;

	public SanPham() {
		super();
	}

	public SanPham(String tenSanPham, String anh, String moTa, int gia, Date ngayThem, Date ngayCapNhat,
			boolean trangThai, Long idNhanVien, Long idDanhMuc) {
		super();
		this.tenSanPham = tenSanPham;
		this.anh = anh;
		this.moTa = moTa;
		this.gia = gia;
		this.ngayThem = ngayThem;
		this.ngayCapNhat = ngayCapNhat;
		this.trangThai = trangThai;
		this.idNhanVien = idNhanVien;
		this.idDanhMuc = idDanhMuc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenSanPham() {
		return tenSanPham;
	}

	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}

	public String getAnh() {
		return anh;
	}

	public void setAnh(String anh) {
		this.anh = anh;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public int getGia() {
		return gia;
	}

	public void setGia(int gia) {
		this.gia = gia;
	}

	public Date getNgayThem() {
		return ngayThem;
	}

	public void setNgayThem(Date ngayThem) {
		this.ngayThem = ngayThem;
	}

	public Date getNgayCapNhat() {
		return ngayCapNhat;
	}

	public void setNgayCapNhat(Date ngayCapNhat) {
		this.ngayCapNhat = ngayCapNhat;
	}

	public boolean isTrangThai() {
		return trangThai;
	}

	public void setTrangThai(boolean trangThai) {
		this.trangThai = trangThai;
	}

	public Long getIdNhanVien() {
		return idNhanVien;
	}

	public void setIdNhanVien(Long idNhanVien) {
		this.idNhanVien = idNhanVien;
	}

	public Long getIdDanhMuc() {
		return idDanhMuc;
	}

	public void setIdDanhMuc(Long idDanhMuc) {
		this.idDanhMuc = idDanhMuc;
	}

}
