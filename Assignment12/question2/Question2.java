package question2;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

class Customer {
	private int id;
	private String name;
	private String contact;

	private HashMap<Double, Date> shoppingLogs = new HashMap<Double, Date>();

	Scanner input = new Scanner(System.in);

	public Customer(String name, int id, String contact) {
		this.name = name;
		this.id = id;
		this.contact = contact;
		keepRecordOfShopping();
	}

	private void keepRecordOfShopping() {
		System.out.print("Enter total Items: ");
		int totalSubject = input.nextInt();
		for (int i = 0; i < totalSubject; i++) {
			System.out.print("Enter Cost of Item " + (i + 1) + ": ");
			double cost = input.nextDouble();
			System.out.print("Enter date in dd-MM-yyyy format:");
			String datein = input.next();
			try {
				Date date = new SimpleDateFormat("yyyy-MM-dd").parse(datein);
				shoppingLogs.put(cost, date);
			} catch (Exception e) {
				System.out.println("Input Date formate mismatch ! try again" + e);
				i--;
			}
		}
	}

	public String getName() {
		return name;
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

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public HashMap<Double, Date> getShoppingLogs() {
		return shoppingLogs;
	}

	public void setShoppingLogs(HashMap<Double, Date> shoppingLogs) {
		this.shoppingLogs = shoppingLogs;
	}

}

public class Question2 {

	public static void main(String[] args) {
		HashMap<String, Customer> customerList = new HashMap<String, Customer>();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Munu :  1:input Customer record\n\t2:Check Details of customer");
			int key = input.nextInt();
			switch (key) {
			case 1:
				System.out.print("Enter Customer ID: ");
				int id = input.nextInt();
				System.out.print("Enter Customer Name:");
				input.nextLine();
				String name = input.nextLine();
				System.out.print("Enter Customer Contact: ");
				String contact = input.nextLine();
				Customer obj = new Customer(name, id, contact);
				customerList.put(name, obj);
				System.out.println("Customer " + name + " record is Filed.\n\n");
				break;
			case 2:
				System.out.print("Enter Customer Name:\n\n");
				input.nextLine();
				String stu = input.nextLine();
				Customer customer;
				try {
					customer = customerList.get(stu);
					System.out.println("===========================");
					System.out.println("       Shopping Details      ");
					System.out.println("===========================");
					HashMap<Double, Date> shoppingList = customer.getShoppingLogs();
					double total = 0;
					for (Double cost : shoppingList.keySet()) {
						System.out.println("   " + shoppingList.get(cost) + " : " + cost);
						total += cost;
					}
					System.out.println("===========================");
					System.out.println(" Net Amount :" + total);
					System.out.println(" Discount:       0% ");
					System.out.println("===========================");

				} catch (Exception e) {
					System.out.println("Customer Not Found in Database.");
					break;
				}

				break;

			default:
				System.out.println("Invalid Input.\n ERROR!!!!");
				break;
			}
			System.out.println("\n\nEnter 0 to exit.");
			if (input.nextInt() == 0) {
				break;
			}
		}

	}
}
