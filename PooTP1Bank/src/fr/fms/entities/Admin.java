package fr.fms.entities;

public class Admin {
	
	private int adminId;
	private String firstname;
	private String lastname;
	private String email;
	//private List<Customer> customersList;
	
	public Admin(int adminId, String firstname, String lastname, String email) {
		this.setAdminId(adminId);
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

	public int getAdminId() {
		return adminId;
	}


	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

}
