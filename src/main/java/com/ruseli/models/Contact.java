package com.ruseli.models;

public class Contact {
	
	Long userId;
	String firstName;
	String lastName;
	String linkedinUrl;
	String email;
	ContactType type;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLinkedinUrl() {
		return linkedinUrl;
	}
	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ContactType getType() {
		return type;
	}
	public void setType(ContactType type) {
		this.type = type;
	}
	public Long getUserId() {
		return userId;
	}
	public Contact(String firstName, String lastName, String linkedinUrl, String email, ContactType type) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.linkedinUrl = linkedinUrl;
		this.email = email;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Contact [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", linkedinUrl="
				+ linkedinUrl + ", email=" + email + ", type=" + type + "]";
	}
	
	
	

}
