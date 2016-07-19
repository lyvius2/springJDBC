package sample.jdbc;

import java.util.Date;

public class Contact {

	private int no;
	private String name;
	private String phone;
	private String email;
	private String addr;
	private Date regdate;
	
	public Contact() {}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public Date getRegdate() {
		return regdate;
	}

	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Contact [no=" + no + ", name=" + name + ", phone=" + phone + ", email=" + email + ", addr=" + addr
				+ ", regdate=" + regdate + "]";
	}
}
