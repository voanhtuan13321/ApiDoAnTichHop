package com.banhang.models;

import java.util.Date;

public class UuDai {

	private Long id;
	private String tieuDe;
	private String noiDung;
	private Date ngayTao;
	private Date ngayCapNhat;
	private Long idNhanVien;

	public UuDai() {
		super();
	}

	public UuDai(String tieuDe, String noiDung, Date ngayTao, Date ngayCapNhat, Long idNhanVien) {
		super();
		this.tieuDe = tieuDe;
		this.noiDung = noiDung;
		this.ngayTao = ngayTao;
		this.ngayCapNhat = ngayCapNhat;
		this.idNhanVien = idNhanVien;
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

	public Long getIdNhanVien() {
		return idNhanVien;
	}

	public void setIdNhanVien(Long idNhanVien) {
		this.idNhanVien = idNhanVien;
	}

}
