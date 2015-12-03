package question2;

import javax.swing.JOptionPane;

public class Employee {
	private String name;
	private int id;
	private String address;
	private String phone;
	private String dob;
	private int age;
	private JobTitle jobtitle;
	private double salary;

	// constractor
	public Employee(String name, int id, String address, String phone, String dob, int i, double salary,
			JobTitle jobtitle) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.phone = phone;
		this.dob = dob;
		this.age = i;
		this.salary = salary;
		this.jobtitle = jobtitle;
	}

	// getter and setter methods
	
	public String getName() {
		return name;
	}

	public JobTitle getJobtitle() {
		return jobtitle;
	}

	public void setJobtitle(JobTitle jobtitle) {
		this.jobtitle = jobtitle;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Salary method
	public double basicSalary() {
		return salary;
	}

	public double currentSalary() {
		int numberOfWork = Integer.parseInt(JOptionPane.showInputDialog("Enter no of year work in company:"));
		return (double) (salary + salary * 0.9 - salary * 0.05);
	}

}
