/*
 * Create an array list of students using their IDs, implement List/Iterator interface in your program. 
 *Program must provide following functions in it (Please set up a menu for user to choose his options to carry the given functions):
i)	Search or Find
ii)	Insert or Add
iii)	Remove or Delete
iv)	Find index of item
v)	Sort

 */

package question1;

import java.util.ArrayList;
import java.util.Scanner;

class ArrayListOpt {
	ArrayList<Integer> list = new ArrayList<Integer>();

	// Search
	public boolean search(int student) {
		return list.contains(student);
	}

	public boolean find(int student) {
		return list.contains(student);
	}

	// Add
	public boolean add(int item) {
		return list.add(item);
	}

	public void addArray(int[] array) {
		for (int item : array) {
			list.add(item);
		}
	}

	// Remove
	public void remove(int studentId) {
		list.remove(studentId);
	}

	public void delete(int studentId) {
		list.remove(studentId);
	}

	// find by index

	public int SearchByIndex(int index) {
		return list.get(index);
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

public class Question1 {

	public static void main(String[] args) {
		ArrayListOpt list = new ArrayListOpt();
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println(
					"Menu: 1 = add new Student ID,\n      2 = remove Student,\n      3 = search Student\n      4 = find by index\n      5 = sort Student ID \n      6 = display student ids");
			int key = input.nextInt();

			switch (key) {
			case 1:
				System.out.print("Enter New Student ID :");
				int studentId = input.nextInt();
				list.add(studentId);
				System.out.println("Student ID " + studentId + " is added.\n");
				break;
			case 2:
				System.out.print("Enter index of Student is :");
				int index = input.nextInt();
				System.out.println("Student ID "+list.SearchByIndex(index)+" in index " + index + " is removed. ");
				list.remove(index);
				break;
			case 3:
				System.out.print("Enter Student ID to search :");
				if (list.search(input.nextInt())) {
					System.out.println("Student ID Found !");
				} else {
					System.out.println("Student ID Not Found !");
				}
				break;
			case 4:
				System.out.print("Enter integer Index value:");
				System.out.println("Item is :" + list.SearchByIndex(input.nextInt()));
				break;
			case 5:
				list.sort();
				System.out.println("Stack is sorted.\n Sorted list is : "+list);
				break;

			case 6:
				System.out.println("Student List : " + list);
				break;

			default:
				System.out.println("Invalid input !!");

				break;
			}

			System.out.println("Enter 1 to continue or press any key int to terminate the program");
			int flag = input.nextInt();
			if (flag != 1)
				break;
		}
		System.out.println("Good Bye");
	}

}
