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
@Table(name = "sanpham")
public class SanPhamEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tensanpham", columnDefinition = "varchar(50)")
	private String tenSanPham;
	
	@Column(columnDefinition = "longtext")
	private String anh;
	
	@Column(name = "mota", columnDefinition = "text")
	private String moTa;
	
	private int gia;
	
	@Column(name = "ngaythem", columnDefinition = "datetime")
	private Date ngayThem;
	
	@Column(name = "ngaycapnhat", columnDefinition = "datetime")
	private Date ngayCapNhat;
	
	@Column(name = "trangthai")
	private boolean trangThai;
	
	@ManyToOne
	@JoinColumn(name = "idnhanvien")
	private NhanVienEntity nhanVien;
	
	@ManyToOne
	@JoinColumn(name = "iddanhmuc")
	private DanhMucEntity danhMuc;

	public SanPhamEntity() {
		super();
	}

	public SanPhamEntity(String tenSanPham, String anh, String moTa, int gia, Date ngayThem, Date ngayCapNhat,
			boolean trangThai, NhanVienEntity nhanVien, DanhMucEntity danhMuc) {
		super();
		this.tenSanPham = tenSanPham;
		this.anh = anh;
		this.moTa = moTa;
		this.gia = gia;
		this.ngayThem = ngayThem;
		this.ngayCapNhat = ngayCapNhat;
		this.trangThai = trangThai;
		this.nhanVien = nhanVien;
		this.danhMuc = danhMuc;
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

	public NhanVienEntity getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVienEntity nhanVien) {
		this.nhanVien = nhanVien;
	}

	public DanhMucEntity getDanhMuc() {
		return danhMuc;
	}

	public void setDanhMuc(DanhMucEntity danhMuc) {
		this.danhMuc = danhMuc;
	}

}
