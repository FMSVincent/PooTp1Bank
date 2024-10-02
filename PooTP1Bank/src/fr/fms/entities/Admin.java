package fr.fms.entities;

import java.util.List;

public class Admin {
	
	private int adminId;
	private String firstname;
	private String lastname;
	private String email;
	//List<Customers> customersList;
	
	public Admin(int adminId, String firstname, String lastname, String email) {
		this.adminId = adminId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
	}
	
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
