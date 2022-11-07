package com.banhang.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "uudai")
public class UuDaiEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tieude", columnDefinition = "varchar(50)")
	private String tieuDe;
	
	@Column(name = "noidung", columnDefinition = "text")
	private String noiDung;
	
	@Column(name = "ngaytao", columnDefinition = "datetime")
	private Date ngayTao;
	
	@Column(name = "ngaycapnhat", columnDefinition = "datetime")
	private Date ngayCapNhat;
	
	@OneToOne
	@JoinColumn(name = "idnhanvien")
	private NhanVienEntity nhanVien;

	public UuDaiEntity() {
		super();
	}

	public UuDaiEntity(String tieuDe, String noiDung, Date ngayTao, Date ngayCapNhat, NhanVienEntity nhanVien) {
		super();
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.ngayTao = ngayTao;
		this.ngayCapNhat = ngayCapNhat;
		this.nhanVien = nhanVien;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTieuDe() {
		return tieuDe;
	}

	public void setTieuDe(String tieuDe) {
		this.tieuDe = tieuDe;
	}

	public String getNoiDung() {
		return noiDung;
	}

	public void setNoiDung(String noiDung) {
		this.noiDung = noiDung;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public Date getNgayCapNhat() {
		return ngayCapNhat;
	}

	public void setNgayCapNhat(Date ngayCapNhat) {
		this.ngayCapNhat = ngayCapNhat;
	}

	public NhanVienEntity getNhanVien() {
		return nhanVien;
	}

	public void setNhanVien(NhanVienEntity nhanVien) {
		this.nhanVien = nhanVien;
	}

}
