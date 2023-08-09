package Task_3;

import java.util.List;
import java.util.ArrayList;
public class Student_Management_System {
	private List<Student> student=new ArrayList<Student>();
	public void addStudent(String name, int rollNumber,String grade) {
		student.add(new Student(name, rollNumber, grade));
		System.out.println("Added successfully...");
	}
	public void removeStudent(int rollNumber) {
		boolean flag=false;
		for (Student student2 : student) {
			if(student2.getRollNumber()==rollNumber) {
				student.remove(student2);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("The Student does'nt exist...");
		}else {
			System.out.println("Removed successfully...");
		}
	}
	public Student searchStudent(int rollNumber) {
		for (Student student2 : student) {
			if(student2.getRollNumber()==rollNumber) {
				return student2;
			}
		}
		return null;
	}
	public void updateStudentName(int rollNumber,String name) {
		boolean flag=false;
		for (Student student2 : student) {
			if(student2.getRollNumber()==rollNumber) {
				student2.setName(name);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("The Student does'nt exist..");
		}else {
			System.out.println("Updated successfully...");
		}
		
	}
	public void updateStudentGrade(int rollNumber,String grade) {
		boolean flag=false;
		for (Student student2 : student) {
			if(student2.getRollNumber()==rollNumber) {
				student2.setName(grade);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("The Student does'nt exist..");
		}else {
			System.out.println("Updated successfully...");
		}
		
	}
	public void updateStudent(int rollNumber,String name,String grade) {
		boolean flag=false;
		for (Student student2 : student) {
			if(student2.getRollNumber()==rollNumber) {
				student2.setName(name);
				student2.setGrade(grade);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("The Student does'nt exist..");
		}
		else {
			System.out.println("Updated successfully...");
		}
		
	}
	public List<Student> getAllStudentsDetails() {
		return student;
	}
}
