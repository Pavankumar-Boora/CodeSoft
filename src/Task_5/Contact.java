package Task_5;

public class Contact {
	private String name;
	private long phoneNumber;
	private String emailAddress;
	
	
	public Contact(String name, long phoneNumber, String emailAddress) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	@Override
	public String toString() {
		return "Name : "+name+" , Phone Number : "+phoneNumber+" , Email Address : "+emailAddress;
	}
	
	
}
