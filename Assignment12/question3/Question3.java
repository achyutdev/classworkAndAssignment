/*
 * Create a Product listing based Linked list which keep track of following information:
v)	ID
vi)	Name
Store the nodes in HashTables and reference them to as Keys and Values. The class needs to 
provide following functions in it:
iii)	Total # of Items available
iv)	Remove Item
v)	Add Item
vi)	Find Item
Write the defined class usage in main class to demonstrate how objects are working.


 */

package question3;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

class Product {
	private int id;
	private String name;

	protected Product next;

	public Product(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		this.next = null;
	}

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

}

class LinkList {

	private HashMap<Product, Product> list = new HashMap<Product, Product>();
	Product previous = null;

	Scanner input = new Scanner(System.in);

	public LinkList() {
	}

	public void add() {
		System.out.print("Enter Product id:");
		int id = input.nextInt();
		System.out.print("Enter Product Name:");
		input.nextLine();
		String name = input.nextLine();
		Product newItem = new Product(id, name);

		if (list.size() == 0) {
			list.put(newItem, newItem.next);
			previous = newItem;
		} else {
			list.put(previous, newItem);
			list.put(newItem, null);
			previous = newItem;
		}
	}

	public void display() {
		System.out.println("\n==================Detail===================");
		for (Entry<Product, Product> lt : list.entrySet()) {
			System.out.println("\tid: " + lt.getKey().getId() + "\t\tName: " + lt.getKey().getName());
		}
		System.out.println("============================================\n");
	}

	public void totalItem() {
		System.out.println("Total item:" + list.size());
	}

	public void remove(String name) {
		for (Entry<Product, Product> prolist : list.entrySet()) {
			if (prolist.getKey().getName().equals(name)) {
				list.remove(prolist.getKey());
			}
		}
		System.out.println("Removal Successfull.");
	}

	public boolean find(int id) {
		for (Entry<Product, Product> prolist : list.entrySet()) {
			if (prolist.getKey().getId() == id) {
				return true;
			}
		}
		return false;
	}
}

public class Question3 {

	public static void main(String[] args) {
		LinkList list = new LinkList();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Munu :  1:add\n\t2:find by id \n\t3:remove\n\t4:Total Item\n\t5:display");
			int key = input.nextInt();
			switch (key) {
			case 1:
				list.add();
				break;
			case 2:
				System.out.print("Enter Product id:");
				int find = input.nextInt();
				if (list.find(find)) {
					System.out.println("Number " + find + " is Found.");
				} else {
					System.out.println("Number " + find + " is NOT Found.");
				}
				break;
			case 3:
				System.out.print("Enter product Name:");
				input.nextLine();
				String name = input.nextLine();
				list.remove(name);
				break;
			case 4:
				list.totalItem();
				break;
			case 5:
				list.display();
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
		System.out.println("Good Bye !");
	}

}
