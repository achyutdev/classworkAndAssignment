/*
 * 	Create a link list of customers using their names, implement List/Iterator interface in your program. 
 * Program must provide following functions in it from main class (Please set up a menu for user to choose
 *  his options to carry the given functions):
i)	Search or Find
ii)	Insert or Add
iii)	Remove or Delete
iv)	Find index of item
v)	Sort

 */

package question2;

import java.util.LinkedList;
import java.util.Scanner;

class ArrayListOpt {
	LinkedList<String> list = new LinkedList<String>();

	// Search
	public boolean search(String student) {
		return list.contains(student);
	}

	public boolean find(String student) {
		return list.contains(student);
	}

	// Add
	public boolean add(String item) {
		return list.add(item);
	}

	public void addArray(String[] array) {
		for (String item : array) {
			list.add(item);
		}
	}

	// Remove
	public void removeByIndex(int studentIndex) {
		list.remove(studentIndex);
	}

	public void removeByName(String name) {
		list.remove(name);
	}

	// find Name from index

	public String SearchByIndex(int index) {
		return list.get(index);
	}

	// find index from Name
	public int SearchByName(String name) {
		return list.indexOf(name);
	}

	// sort
	public void sort() {
		list.sort(null);
	}

	// to string
	public String toString() {
		return list.toString();
	}

}

public class Question2 {

	public static void main(String[] args) {
		ArrayListOpt list = new ArrayListOpt();
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println(
					"Menu: 1 = add new Student ID,\n      2 = remove Student,\n      3 = search Student\n      4 = find by index\n      5 = sort Student ID \n      6 = display student ids");
			int key = input.nextInt();
			boolean flag = false;
			switch (key) {
			case 1:
				System.out.print("Enter New Student Name :");
				input.nextLine(); //this is only hold newline character
				String student = input.nextLine();
				list.add(student);
				System.out.println("Student " + student + " is added.\n");
				break;
			case 2:
				System.out.print("Enter index of Student or Student Name :");
				input.nextLine(); //this is only hold newline character
				String name = input.nextLine();
				try {
					int index = Integer.parseInt(name);
					System.out.println(
							"Student Name " + list.SearchByIndex(index) + " in index " + index + " is removed. ");
					list.removeByIndex(index);
				} catch (Exception e) {
					System.out.println("Student Name " + name + " in index " + list.SearchByName(name) + " is removed. ");
				}

				break;
			case 3:
				System.out.print("Enter Student Name to search :");
				input.nextLine(); //this is only hold newline character
				String std = input.nextLine();
				if (list.search(std)) {
					System.out.println("Student Name Found !");
				} else {
					System.out.println("Student Name Not Found !");
				}
				break;
			case 4:
				System.out.print("Enter integer Index value:");
				System.out.println("Item is :" + list.SearchByIndex(input.nextInt()));
				flag = true;
				break;
			case 5:
				list.sort();
				System.out.println("Stack is sorted.\nSorted list is : " + list+"\n\n");
				flag = true;
				break;

			case 6:
				System.out.println("Student List : " + list);
				flag = true;
				break;

			default:
				System.out.println("Invalid input !!");
				flag = true;
				break;
			}

			System.out.println("Continue ? if yes press 'yes' or press any key");
			if(flag)input.nextLine();
			String flage = input.nextLine();
			if (!flage.toLowerCase().equals("yes"))
				break;
		}
		System.out.println("Good Bye");
	}

}
