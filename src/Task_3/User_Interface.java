 package Task_3;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class User_Interface {
	static Scanner sc=new Scanner(System.in);
	static Student_Management_System sms=new Student_Management_System();
	public static void main(String[] args) {
		try {
		do {
		System.out.println("Select one option from below..\n1.Add new Student\n2.Update Existing Student Details\n3.Searching for  Student\n4.Get all Student Details\n5.Remove a particular Student\n0.exit");
		
		int option=sc.nextInt();
		switch(option) {
		case 1:{
			System.out.println("Enter Student Name : ");
			sc.nextLine();
			String name=sc.nextLine();
			System.out.println("Enter Student RollNumber : ");
			int rollNumber=sc.nextInt();
			System.out.println("Enter Student Grade : ");
			sc.nextLine();
			String grade=sc.nextLine();
			sms.addStudent(name, rollNumber, grade);
			break;
		}
		case 2:{
			System.out.println("Select one from below..\n1.Update only Name\n2.Update only Grade\n3.Update both Name and Grade\n0.Exit");
			int option1=sc.nextInt();
			switch(option1) {
			case 1:{
				System.out.println("Enter Existing Rollnumber : ");
				int rollNumber=sc.nextInt();
				System.out.println("Enter Student new Name : ");
				sc.nextLine();
				String name=sc.nextLine();
				sms.updateStudentName(rollNumber, name);
				break;
			}
			case 2:{
				System.out.println("Enter Existing Rollnumber : ");
				int rollNumber=sc.nextInt();
				System.out.println("Enter Student new Grade : ");
				sc.nextLine();
				String grade=sc.nextLine();
				sms.updateStudentGrade(rollNumber, grade);
				break;
			}
			case 3:{
				System.out.println("Enter Existing Rollnumber : ");
				int rollNumber=sc.nextInt();
				System.out.println("Enter Student new Name : ");
				sc.nextLine();
				String name=sc.nextLine();
				System.out.println("Enter Student new Grade : ");
				sc.nextLine();
				String grade=sc.nextLine();
				sms.updateStudent(rollNumber, name, grade);
				break;
			}case 0:{
				System.out.println("Thank you..");
				System.exit(0);
			}
			default:{
				System.out.println("Please choose valid option...");
			}
			}
			break;
		}
		case 3:{
			System.out.println("Enter Student Rollnumber : ");
			int rollNumber=sc.nextInt();
			Student details =sms.searchStudent(rollNumber);
			if(details!=null) {
				System.out.println("Name : "+details.getName()+" , HallTicket Number : "+details.getRollNumber()+" , Grade "+details.getGrade());
			}
			else {
				System.out.println("The Student does'nt Exist...");
			}
			break;
		}
		case 4:{
			List<Student> student=sms.getAllStudentsDetails();
			
			if(student.size()>=1) {
				System.out.println("All Students details are : ");
				for (Student student2 : student) {
					System.out.println("Name : "+student2.getName()+" , HallTicket Number : "+student2.getRollNumber()+" , Grade "+student2.getGrade());
				}
			}else {
				System.out.println("There is no student records available...");
			}
			break;
		}
		case 5:{
			System.out.println("Enter Student RollNumber : ");
			int rollNumber=sc.nextInt();
			sms.removeStudent(rollNumber);
			break;
		}
		case 0:{
			System.out.println("Thank you..");
			System.exit(0);
		}
		default:{
			System.out.println("Please choose valid option...");
		}
		}
		}while(true);
		}catch (InputMismatchException e) {
			System.out.println("You entered invalid data");
		}
		finally {
			System.out.println("Thank you..");
		}
	}

}
