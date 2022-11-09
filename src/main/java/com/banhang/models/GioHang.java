package com.banhang.models;

public class GioHang {

	private Long id;
	private Long idKhachHang;
	private Long idSanPham;
	private int soLuong;

	public GioHang() {
		super();
	}

	public GioHang(Long idKhachHang, Long idSanPham, int soLuong) {
		super();
		this.idKhachHang = idKhachHang;
		this.idSanPham = idSanPham;
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

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

}
