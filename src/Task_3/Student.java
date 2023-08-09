package Task_3;

public class Student {

	private String name;
	private int rollNumber;
	private String grade;
	
	//Constructor
	public Student(String name, int rollNumber, String grade) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
	}
	
	//Getters and Setters methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String toString() {
		return "Name : "+name+" , HallTicket Number : "+rollNumber+" , Grade "+grade;
	}
	
	
}
