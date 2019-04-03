package com.hoangphuc.entity;

import java.util.List;
import java.util.Map;

public class NhanVien {
	String tennhanvien;
	String diachi;
	int tuoi;
	GiamDoc giamDoc;
	Map<String, Object> map;


	List<GiamDoc> list;

	
	public List<GiamDoc> getList() {
		return list;
	}

	public void setList(List<GiamDoc> list) {
		this.list = list;
	}

	public GiamDoc getGiamDoc() {
		return giamDoc;
	}

	public void setGiamDoc(GiamDoc giamDoc) {
		this.giamDoc = giamDoc;
	}

	public String getTennhanvien() {
		return tennhanvien;
	}

	public void setTennhanvien(String tennhanvien) {
		this.tennhanvien = tennhanvien;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public NhanVien() {}
	
	public NhanVien(GiamDoc giamDoc) {
		this.giamDoc = giamDoc;
	}
	
	public NhanVien(String tennhanvien, int tuoi) {
		this.tennhanvien = tennhanvien;
		this.tuoi = tuoi;
	}
	
	public void getThongBao() {
		System.out.print("Thong bao: " + tennhanvien + tuoi);	
	}

}
