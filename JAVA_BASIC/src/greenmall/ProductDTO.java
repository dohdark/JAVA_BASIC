package greenmall;

import java.util.Date;

public class ProductDTO {
	private int pno;	// 제품번호
	private String pname; 	// 제품이름
	private int price;	// 제품가격
	private Date regdate;
	
	public ProductDTO() {}

	public ProductDTO(int pno, String pname, int price, Date regdate) {
		super();
		this.pno = pno;
		this.pname = pname;
		this.price = price;
		this.regdate = regdate;
	}

	public int getPno() {
		return pno;
	}

	public void setPno(int pno) {
		this.pno = pno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
	// 캡슐화 !!!
}
