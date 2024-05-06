package Exercise7;
import java.util.ArrayList;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private List <Double> grades;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List <Double> getGrades(){
		return grades;
	}
	public void addGrade(double grade) {
		if(grades == null) {
			grades = new ArrayList < > ();
		}
		grades.add(grade);
	}

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setId(1234567);
		student.setName("Ellie Forbes");
		
		student.addGrade(99.3);
		student.addGrade(87.9);
		student.addGrade(96.1);
		
		System.out.println("***** Student *****");
		System.out.println("ID: " + student.getId() + "\nName: " + student.getName() + "\nGrades: " + student.getGrades());

	}

}
