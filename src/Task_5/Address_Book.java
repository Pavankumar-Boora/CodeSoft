package Task_5;

import java.util.ArrayList;
import java.util.List;

public class Address_Book {
	List<Contact> contact=new ArrayList<Contact>();
	
	
	public void addContact(String name,long phoneNumber,String emailAddress) {
		contact.add(new Contact(name, phoneNumber, emailAddress));
		System.out.println("New Contact added Successfully...");
	}
	
	
	public Contact searchContact(long phoneNumber) {
		for (Contact contact2 : contact) {
			if(contact2.getPhoneNumber()==phoneNumber) {
				return contact2;
			}
		}
		return null;
	}
	
	
	public List<Contact> displayAllContacts() {
		return contact;
	}
	
	
	public void removeContact(long phoneNumber) {
		boolean flag=false;
		for (Contact contact2 : contact) {
			if(contact2.getPhoneNumber()==phoneNumber) {
				contact.remove(contact2);
				flag=true;
				System.out.println("Contact removed Successfully...");
			}
		}
		if(!flag) {
			System.out.println("Contact does'nt exist...");
		}
	}

}
