package com.studdype.test.model.dto.board;

import org.springframework.web.multipart.MultipartFile;

public class FileDto {
	private int f_no; // ���� ��ȣ
	private int b_no; // �Խñ� ��ȣ
	private String f_name; // ���� ���� �̸�
	private String photo_ismain; // ��ǥ����
	private MultipartFile myfile;

	public FileDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	// ���� �Խ��� ���� ������
	public FileDto(int f_no, int b_no, String f_name, String photo_ismain) {
		super();
		this.f_no = f_no;
		this.b_no = b_no;
		this.f_name = f_name;
		this.photo_ismain = photo_ismain;
	}

	// �Ϲ� ���� ������
	public FileDto(int f_no, int b_no, String f_name) {
		super();
		this.f_no = f_no;
		this.b_no = b_no;
		this.f_name = f_name;
	}

	public int getF_no() {
		return f_no;
	}

	public void setF_no(int f_no) {
		this.f_no = f_no;
	}

	public int getB_no() {
		return b_no;
	}

	public void setB_no(int b_no) {
		this.b_no = b_no;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getPhoto_ismain() {
		return photo_ismain;
	}

	public void setPhoto_ismain(String photo_ismain) {
		this.photo_ismain = photo_ismain;
	}

	public MultipartFile getMyfile() {
		return myfile;
	}

	public void setMyfile(MultipartFile myfile) {
		this.myfile = myfile;
	}

	@Override
	public String toString() {
		return "FileDto [f_no=" + f_no + ", b_no=" + b_no + ", f_name=" + f_name + ", photo_ismain=" + photo_ismain
				+ ", myfile=" + myfile + "]";
	}
	
	

}
