package question2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class QueueImp {
	public Queue<String> queue = new LinkedList<String>();

	public void insert(String str) {
		queue.add(str);
	}

	public boolean find(String str) {
		return queue.contains(str);
	}

	public void delete() {
		queue.remove();
	}

	public String findByIndex(int index) {
		int i = 0;
		for (String string : queue) {
			if (i == index)
				return string;
			i++;
		}
		return null;
	}

	public void display() {
		System.out.print(queue);
		System.out.println();
	}

	public String peek() {
		return queue.peek();
	}
}

public class Question2 {

	public static void main(String[] args) {
		QueueImp obj = new QueueImp();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Munu :  1:insert\n\t2:find\n\t3:delete\n\t4:find by Index\n\t5:display");
			int key = input.nextInt();
			switch (key) {
			case 1:
				System.out.print("Enter String:");
				input.nextLine();
				String str = input.nextLine();
				obj.insert(str);
				System.out.println("String '" + str + "' inserted.");
				break;
			case 2:
				System.out.print("Enter String:");
				input.nextLine();
				String find = input.nextLine();
				if (obj.find(find)) {
					System.out.println("String " + find + " is Found.");
				} else {
					System.out.println("String " + find + " is NOT Found.");
				}
				break;
			case 3:
				System.out.print("Enter String:");
				System.out.println("Number " + obj.peek() + " Deleted.");
				obj.delete();
				break;
			case 4:
				System.out.print("Enter Index Number:");
				int index = input.nextInt();
				System.out.println("Number at Index " + index + " is " + obj.findByIndex(index));
				break;
			case 5:
				System.out.print("Queue :");
				obj.display();
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
