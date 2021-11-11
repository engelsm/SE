import java.util.ArrayList;

public class Course {
	public int id;
	public String name;
	public int maxCapacity;
	public boolean isFull;
	public Professor prof;
	public ArrayList<Student> student;
	public ArrayList<Exam> exam;
	
	public Course(int id,String name,int cap, Professor prof) {
		this.id = id;
		this.name = name;
		this.maxCapacity = cap;
		this.prof = prof;
	}
	
	public void Enroll(Student student) {
		this.student.add(student);
	}
	
	public void Apply(TA ta) {
		
	}
	
	public void setMaxCap(int max) {
		this.maxCapacity = max;
	}
	
	public Professor getProf() {
		return prof;
	}	
	
	public TA getTA() {
		return null;
	}
	
}
