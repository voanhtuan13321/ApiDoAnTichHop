package com.banhang.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "danhmuc")
public class DanhMucEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "tendanhmuc", columnDefinition = "varchar(50)")
	private String tenDanhMuc;

	public DanhMucEntity() {
		super();
	}

	public DanhMucEntity(String tenDanhMuc) {
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
