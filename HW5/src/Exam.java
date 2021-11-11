import java.util.ArrayList;

public class Exam {
	public int max_value;
	public Course course;
	public ArrayList<Question> questions;
	public ArrayList<Student> student;
	
	public boolean register(Student s) {
		return true; //why boolean?
	}
	
	public void addQuestion(int id,String task,int value) {
		questions.add(new Question(id,task,value));
	}
	
	public ArrayList<Student> getRegisteredStudents() {
		return student;
	}
	
	public void setMaxValue(int max) {
		this.max_value = max;
	}
}
