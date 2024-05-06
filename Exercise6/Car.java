package Exercise6;

public class Car {
	private String company_name;
	private String model_name;
	private int year;
	private double mileage;
	
	public String getCompany_name() {
		return company_name;
	}
	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}
	public String getModel_name() {
		return model_name;
	}
	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getMileage() {
		return mileage;
	}

	public static void main(String[] args) {
		Car car = new Car();
		
		car.setCompany_name("Chevrolet");
		car.setModel_name("Cruze");
		car.setYear(2009);
		
		System.out.println("***** Car *****");
		System.out.println("Company Name: " + car.getCompany_name() + "\nModel Name: " + car.getModel_name() + "\nYear: " + car.getYear() + "\nMileage: " + car.getMileage());

	}

}
