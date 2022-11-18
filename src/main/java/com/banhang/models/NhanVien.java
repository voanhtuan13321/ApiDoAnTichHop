package com.banhang.models;

import java.util.Date;

public class NhanVien {

	private Long id;
	private String hoTen;
	private Date ngaySinh;
	private String soDienThoai;
	private String cccd;
	private String taiKhoan;
	private String matKhau;

	public NhanVien() {
		super();
	}

	public NhanVien(String hoTen, Date ngaySinh, String soDienThoai, String cccd, String taiKhoan, String matKhau) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.soDienThoai = soDienThoai;
		this.cccd = cccd;
		this.taiKhoan = taiKhoan;
		this.matKhau = matKhau;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public String getCccd() {
		return cccd;
	}

	public void setCccd(String cccd) {
		this.cccd = cccd;
	}

	public String getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(String taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getMatKhau() {
		return matKhau;
	}

	public void setMatKhau(String matKhau) {
		this.matKhau = matKhau;
	}

}
