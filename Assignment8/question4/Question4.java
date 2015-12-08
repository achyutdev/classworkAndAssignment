/*
 * Design a software for Super market, where they sale products which can be categorized on the bases of daily 
 * production and stock products, where daily products are discarded at the end of day. There are customers which
 * can buy these products and customers can be categorized as registered and normal customers. Registered customers
 * gets 10% discount on every purchase, while in case of normal customers they get same discount if they purchase
 * more than 100 USD.  The store is managed by Manager, Sale Staff and Workers, where Sale staff gets commission on 
 * each month with a rate of 5%.
 */

package question4;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		System.out.println("WelCome to SuperMarket");
		System.out.println("======================");

		Scanner input = new Scanner(System.in);
		System.out.print("Are you a register customer(enter 'yes' or 'no'): ");
		String str = input.nextLine();
		if (str.toLowerCase().equals("yes")) {
			RegisterCustomer customer = new RegisterCustomer();
			customer.payment();
			System.out.println();
			System.out.println();
			customer.showBill();
		} else if (str.toLowerCase().equals("no")) {
			NormalCustomer customer = new NormalCustomer();
			customer.payment();
			customer.showBill();
		} else {
			System.out.println("Error!!");
		}

		// Employee Details
		Manager manager = new Manager("Ram Kumar", "ram.kumar@mum.edu", "Manager", 20000.23);
		System.out.println(manager.getName());
		System.out.println(manager.getAddress());
		System.out.println(manager.getTitle());
		System.out.println(manager.getMonthlySalary());
		manager.setAddress("kumar.ram@mum.edu");
		System.out.println(manager.getAddress());

		Salestaff sellstaff1 = new Salestaff("Devid", "david@mum.edu", "sell manager", 40000.23);
		System.out.println(sellstaff1.getName());
		System.out.println(sellstaff1.getAddress());
		System.out.println(sellstaff1.getTitle());
		System.out.println(sellstaff1.getMonthlySalary());
		sellstaff1.setName("Devindrar");
		System.out.println(sellstaff1.getName());

		Salestaff sellstaff2 = new Salestaff("Roish asdr", "am.rkur@mum.edu", "sell codinator", 46000.23);
		System.out.println(sellstaff2.getName());
		System.out.println(sellstaff2.getTitle());
		System.out.println(sellstaff2.getAddress());
		System.out.println(sellstaff2.getMonthlySalary());
		sellstaff2.setAddress("jpt_mail@mum.edu");
		System.out.println(sellstaff2.getAddress());

		Worker worker = new Worker("Rarisadf", "ritda.r@mum.edu", "Sr. worker", 23000.23);
		System.out.println(worker.getName());
		System.out.println(worker.getAddress());
		System.out.println(worker.getMonthlySalary());
		worker.setTitle("THe WOker");
		System.out.println(worker.getTitle());

		// total employee
		System.out.println("\n\nTotal Employee in Company:" + Employee.getTotalEmployee());
		System.out.println("Total Manager in Company:" + Manager.getManagerTotal());
		System.out.println("Total SaleStaff in Company:" + Salestaff.getSalestaffTotal());
		System.out.println("Total Worker in Company:" + Worker.getworkerTotal());

	}

}
