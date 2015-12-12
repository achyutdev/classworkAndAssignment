package question4;

import java.util.Scanner;

class Student {
	private String name;
	private int id;
	private String address;
	private String program;
	private int age;

	protected Student next;

	public Student(String name, int id, String address, String program, int age, Student next) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
		this.program = program;
		this.age = age;
		this.next = next;
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getProgram() {
		return program;
	}

	public int getAge() {
		return age;
	}

}

class LinkList {
	private Student first;

	public LinkList() {
		this.first = null;
	}

	public void display() {
		System.out.println("\n ============================Student Details=================================");
		for (Student current = first; current != null; current = current.next) {
			System.out.println("\tId: " + current.getId() + "\tName: " + current.getName() + "\tAddress: "
					+ current.getAddress() + "\tAge: " + current.getAge() + "\tProgram: " + current.getProgram());
		}
		System.out.println("\n ============================================================================\n\n");
	}

	public void add() {
		Student newStudent = registerNewStudent();
		if (first == null) {
			first = newStudent;
		} else {
			Student current = first;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newStudent;
		}
	}

	private Student registerNewStudent() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student Id: ");
		int id = input.nextInt();
		System.out.println("Enter student Name: ");
		input.nextLine();
		String name = input.nextLine();
		System.out.println("Enter student address: ");
		String address = input.nextLine();
		System.out.println("Enter student program: ");
		String program = input.nextLine();
		System.out.println("Enter student age: ");
		int age = input.nextInt();
		Student newStudent = new Student(name, id, address, program, age, null);
		System.out.println("New Student " + name + " is registered.");
		return newStudent;
	}

	public void deleteFromStudentID(int id) {
		Student del = findStudentObj(id);
		Student next = del.next;
		if(del == first){
			first=next;
		}else{
			Student parent = first;
			while(parent.next!=del){
				parent=parent.next;
			}
			parent.next=next;
		}
		System.out.println("Record deleted successfully.");
	}

	private Student findStudentObj(int id) {
		for (Student current = first; current != null; current = current.next) {
			if (current.getId() == id) {
				return current;
			}
		}
		System.out.println("Student Id " + id + " Not Found.");
		return null;
	}

	public void findById(int id) {
		for (Student current = first; current != null; current = current.next) {
			if (current.getId() == id) {
				System.out.println("Student Id Found.");
				System.out.println("\n ============================Student Details=================================");
				System.out.println("\tId: " + current.getId() + "\tName: " + current.getName() + "\tAddress: "
						+ current.getAddress() + "\tAge: " + current.getAge() + "\tProgram: " + current.getProgram());
				System.out
						.println("\n ============================================================================\n\n");
			}
		}
		System.out.println("Student Id " + id + " Not Found.");
	}
	
	public void sort(){
		LinkList sorted = new LinkList();
		Student unsorted = first;
		while(unsorted !=null){
			Student next = unsorted;
			unsorted = next.next;
			sorted.insertSorted(next);
		}
		first=sorted.first;
	}

	private void insertSorted(Student next) {
		Student parent = null, current =first;
		while(current!=null && next.getId()>current.getId()){
			parent = current;
			current = current.next;
		}
		next.next=current;
		if(parent ==null)
			first=next;
		else
			parent.next=next;
	}
}

class StackOpt extends LinkList{
	
}

class QueueOpt extends LinkList{
	
}

public class Question4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		LinkList obj = new LinkList();
		while (true) {
			System.out.println("Munu :  1:add\n\t2:find by Id\n\t3:display\n\t4:delete\n\t5:peek\n\t6:display");
			int key = input.nextInt();
			switch (key) {
			case 1:
				obj.add();
				break;
			case 2:
				System.out.print("Enter Student Id:");
				int find = input.nextInt();
				obj.findById(find);
				break;
			case 3:
				obj.display();
				break;
			case 4:
				System.out.print("Enter Stuent ID:");
				obj.deleteFromStudentID(input.nextInt());
				break;
			case 5:
				// System.out.print("Peek(tail value) :" + obj.peek());
				// break;
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
