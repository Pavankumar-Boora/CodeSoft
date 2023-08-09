package Task_5;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class User_Interface {
static Scanner sc=new Scanner(System.in);
static Address_Book aB=new Address_Book();
	public static void main(String[] args) {
		try {
		do {
		System.out.println("Select one from below...\n1.Add new Contact\n2.Search a Contact\n3.Display all Contact details\n4.Remove a Contact\n0.Exit");
		int option=sc.nextInt();
		switch(option) {
		case 1:{
			System.out.println("Enter Contact Name : ");
			sc.nextLine();
			String name =sc.nextLine();
			System.out.println("Enter Contact Number : ");
			long mobileNumber=sc.nextLong();
			System.out.println("Enter Contact Email Address : ");
			sc.nextLine();
			String email =sc.nextLine();
			aB.addContact(name, mobileNumber, email);
			break;
		}
		case 2:{
			System.out.println("Enter Contact Number : ");
			long mobileNumber=sc.nextLong();
			Contact contact=aB.searchContact(mobileNumber);
			if(contact!=null) {
				System.out.println("Name : "+contact.getName()+" , Phone Number : "+contact.getPhoneNumber()+" , Email Address : "+contact.getEmailAddress());
			}
			else {
				System.out.println("Contact does'nt exist...");
			}
			break;
		}
		case 3:{
			List<Contact> contact=aB.displayAllContacts();
			if(contact.size()>=1) {
				System.out.println("The Contact details are : ");
				for (Contact contact2 : contact) {
					System.out.println("Name : "+contact2.getName()+" , Phone Number : "+contact2.getPhoneNumber()+" , Email Address : "+contact2.getEmailAddress());
				}
			}
			else {
				System.out.println("There is no contact details...");
			}
			break;
		}
		case 4:{
			System.out.println("Enter Contact Number : ");
			long mobileNumber=sc.nextLong();
			aB.removeContact(mobileNumber);
			break;
		}
		case 0:{
			System.out.println("Thank you");
			System.exit(0);
		}
		default:{
			System.out.println("Please choose valid option...");
		}
		}
		}while(true);
		}catch(InputMismatchException e) {
			System.out.println("You Entered invalid data..");
		}
		finally {
			System.out.println("Thank you");
		}
	}

}
