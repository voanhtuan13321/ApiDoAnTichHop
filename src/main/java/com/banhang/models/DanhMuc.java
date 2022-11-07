package com.banhang.models;

public class DanhMuc {

	private Long id;
	private String tenDanhMuc;

	public DanhMuc() {
		super();
	}

	public DanhMuc(String tenDanhMuc) {
		super();
		this.tenDanhMuc = tenDanhMuc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}

}
