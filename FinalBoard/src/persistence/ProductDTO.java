package persistence;

import java.util.Date;

public class ProductDTO {
	private int pno; //데이터베이스가 만든다, 자동증가
	private String category; //직접입력
	private String pname; //직접입력
	private String pcontent; //직접입력
	private String pwriter; //자동 입력
	private int readcount; // 자동 입력
	private Date regdate; // 데이터베이스가 만든다
	private Date moddate; // 데이터베이스가 만든다
	private String imgfile; // 직접입력
	
	public ProductDTO() {}

	public ProductDTO(String category, String pname, String pcontent, String pwriter, String imgfile) {		
		this.category = category;
		this.pname = pname;
		this.pcontent = pcontent;
		this.pwriter = pwriter;
		this.imgfile = imgfile;
	}

	public ProductDTO(int pno, String category, String pname, String pcontent) {
		this.pno = pno;
		this.category = category;
		this.pname = pname;
		this.pcontent = pcontent;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPcontent() {
		return pcontent;
	}

	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}

	public String getPwriter() {
		return pwriter;
	}

	public void setPwriter(String pwriter) {
		this.pwriter = pwriter;
	}

	public int getReadcount() {
		return readcount;
	}

	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	public Date getModdate() {
		return moddate;
	}

	public void setModdate(Date moddate) {
		this.moddate = moddate;
	}

	public String getImgfile() {
		return imgfile;
	}

	public void setImgfile(String imgfile) {
		this.imgfile = imgfile;
	}	
}
