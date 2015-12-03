/*
 * Create a class Employee which can hold the following information about employees
Name
ID
Address
Phone#
DoB
Age in years (See the lecture slides and read about Date and GregorianCalendar class)
Job title (Job title itself is a class that contains following information ID, Title, Level, Description e.g. 01, Manager,
 Middle Management, Need to manage projects and carry out operations) 
 Salary (There are two salaries Basic and Current, where basic is initial value set in contract and current salary is= Basic+
 (10% of basic number of years employee worked in organization)- 
%TAX (5% of basic salary, Where TAX% remains same for every employee)
 */

package question2;

public class Question2 {

	public static void main(String[] args) {
//		Employee details
		Employee john = new Employee("John Dia", 231, "Fairfield,IA", "9849942199", "April 24", 25, 2500.05, new JobTitle(123,"Manager", "Senior", "Business development"));
		Employee eva = new Employee("Eva Dease", 124, "Hellon town, NY", "768273432", "July 3", 23, 6500.05, new JobTitle(13,"CEO", "Founder", "All over operation"));
	
		System.out.println(john.basicSalary());
		System.out.println(john.currentSalary());
		System.out.println(john.getAddress());
		System.out.println(john.getJobtitle().getDescription());
		System.out.println(john.getJobtitle().getTitle());
		System.out.println(john.getAge());
		System.out.println(john.getName());
		
	}

}
