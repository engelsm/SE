import java.util.ArrayList;

public class Project {
	public String name;
	public ArrayList<Student> members;
	public ArrayList<Course> course;
	
	public String getName() {
		return name;
	}
	
	public void setName(String n) {
		this.name = n;	
	}
	
	public void addNewMember(Student s) {
		members.add(s);
	}

	public ArrayList<Student> getMembers(){
		return members;
	}
	
}
