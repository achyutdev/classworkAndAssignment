package question4;

public class Employee {
	private static int totalEmployee=0;
	
//	employee details
	private String name;
	private String address;
	private String title;
	
	public Employee(String name, String address, String title) {
		this.name = name;
		this.address = address;
		this.title = title;
		totalEmployee++;
	}

	public static int getTotalEmployee() {
		return totalEmployee;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}

class Manager extends Employee{
	
	private static int managerTotal=0;
	
	private double basicSalary;
	final static double commission=0;
	
	public Manager(String name, String address, String title,double salary) {
		super(name, address, title);
		this.basicSalary=salary;
		managerTotal++;
	}
	public double getMonthlySalary(){
		return basicSalary;
	}
	public static int getManagerTotal() {
		return managerTotal;
	}
	
}

class Salestaff extends Employee{
	
	private static int SalestaffTotal=0;
	
	private double basicSalary;
	final static double commission=0.05;
	
	public Salestaff(String name, String address, String title,double salary) {
		super(name, address, title);
		this.basicSalary=salary;
		SalestaffTotal++;
	}
	
	public double getMonthlySalary(){
		return basicSalary+basicSalary*commission;
	}
	public static int getSalestaffTotal() {
		return SalestaffTotal;
	}
}

class Worker extends Employee{

private static int workerTotal=0;
	
	private double basicSalary;
	final static double commission=0;
	
	public Worker(String name, String address, String title,double salary) {
		super(name, address, title);
		this.basicSalary=salary;
		workerTotal++;
	}
	
	public double getMonthlySalary(){
		return basicSalary+basicSalary*0.05;
	}
	public static int getworkerTotal() {
		return workerTotal;
	}
}