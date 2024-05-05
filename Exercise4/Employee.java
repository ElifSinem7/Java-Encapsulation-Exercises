package Exercise4;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
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
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setId(135782);
		employee.setName("Caelius Dathan");
		employee.setSalary(5690.0);
		
		System.out.println("***** Employee Details *****");
		System.out.println("Id: " + employee.getId() + "\nName: " + employee.getName() + "\nSalary: " + employee.getSalary());

	}

}
