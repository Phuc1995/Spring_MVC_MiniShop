package com.hoangphuc.entity;

public class GiamDoc extends NhanVien {
	String chucVu;
	
	public GiamDoc(String chucvu, String tennhanvien, int tuoi ) {
		this.chucVu = chucvu;
	}

	public String getChucVu() {
		return chucVu;
	}

	public void setChucVu(String chucVu) {
		this.chucVu = chucVu;
	}
	
}
