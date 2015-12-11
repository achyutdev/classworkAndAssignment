import java.util.Scanner;

class MyQueue {
	private int[] arrayQueue;
	private int size;
	private int head;

	public MyQueue(int size) {
		this.size = size;
		arrayQueue = new int[size];
		head = -1;
	}

	public void push(int num) {
		if (head == size - 1) {
			System.out.println("Queue Array is Full");
		} else {
			head++;
			arrayQueue[head] = num;
			System.out.println("Number " + num + " inserted.");
		}
	}

	public void pop() {
		if (head == -1) {
			System.out.println("Queue Array is Empty.");
		} else {
			System.out.println("Number " + arrayQueue[0] + " Deleted.");
			for (int i = 1; i < arrayQueue.length; i++) {
				arrayQueue[i - 1] = arrayQueue[i];
			}
			arrayQueue[head] = 0;
			head--;
		}
	}

	public void display() {
		for (int j = 0; j <= head; j++) {
			System.out.print(arrayQueue[j] + "  ");
		} 
		System.out.println();
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getHead() {
		return head;
	}

	public void setHead(int head) {
		this.head = head;
	}

	public void findByIndex(int index) {
		if(index>head){
			System.out.println("Out of bound of Queue Array.");
		}else
			System.out.println("Number at Index " + index + " is " + arrayQueue[index] );
	}

	public boolean find(int find) {
		for (int i : arrayQueue) {
			if (i == find)
				return true;
		}
		return false;
	}

	public int peek() {
		return arrayQueue[0];
	}

}

public class Question3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter size of queue:");
		MyQueue obj = new MyQueue(input.nextInt());
		while (true) {
			System.out.println("Munu :  1:push\n\t2:find by value\n\t3:pop\n\t4:find by Index\n\t5:peek\n\t6:display");
			int key = input.nextInt();
			switch (key) {
			case 1:
				System.out.print("Enter integer Number:");
				int num = input.nextInt();
				obj.push(num);
				break;
			case 2:
				System.out.print("Enter integer Number:");
				int find = input.nextInt();
				if (obj.find(find)) {
					System.out.println("Number " + find + " is Found.");
				} else {
					System.out.println("Number " + find + " is NOT Found.");
				}
				break;
			case 3:
				obj.pop();
				break;
			case 4:
				System.out.print("Enter Index Number:");
				obj.findByIndex(input.nextInt());
				break;
			case 5:
				System.out.print("Peek(tail value) :" + obj.peek());
				break;
			case 6:
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