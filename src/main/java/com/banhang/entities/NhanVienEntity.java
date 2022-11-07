package com.banhang.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "nhanvien")
public class NhanVienEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name =" hoten", columnDefinition = "varchar(50)")
	private String hoTen;
	
	@Column(name = "ngaysinh", columnDefinition = "datetime")
	private Date ngaySinh;
	
	@Column(name = "sodienthoai", columnDefinition = "varchar(10)")
	private String soDienThoai;
	
	@Column(columnDefinition = "varchar(12)")
	private String cccd;
	
	@Column(name = "taikhoan", columnDefinition = "varchar(50)")
	private String taiKhoan;
	
	@Column(name = "matkhau", columnDefinition = "varchar(50)")
	private String matKhau;

	public NhanVienEntity() {
		super();
	}

	public NhanVienEntity(String hoTen, Date ngaySinh, String soDienThoai, String cccd, String taiKhoan,
			String matKhau) {
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
