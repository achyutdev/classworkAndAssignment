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
	protected Student first;

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
		if(del==null)return;
		Student next = del.next;
		if (del == first) {
			first = next;
		} else {
			Student parent = first;
			while (parent.next != del) {
				parent = parent.next;
			}
			parent.next = next;
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
				return;
			}
		}
		System.out.println("Student Id " + id + " Not Found.");
	}

	public void sort() {
		LinkList sorted = new LinkList();
		Student unsorted = first;
		while (unsorted != null) {
			Student next = unsorted;
			unsorted = next.next;
			sorted.insertSorted(next);
		}
		first = sorted.first;
	}

	private void insertSorted(Student next) {
		Student parent = null, current = first;
		while (current != null && next.getId() > current.getId()) {
			parent = current;
			current = current.next;
		}
		next.next = current;
		if (parent == null)
			first = next;
		else
			parent.next = next;
	}

	public Student pop() {
		// override from extended class
		return null;
	}

	public Student peek() {
		// override from extended class
		return null;
	}
}

class StackOpt extends LinkList {

	@Override
	public Student pop() {
		Student current = first;
		if (first == null) {
			return first;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			Student tmp = current;
			current = null;
			return tmp;
		}
	}

	@Override
	public Student peek() {
		Student current = first;
		if (first == null) {
			return first;
		} else {
			while (current.next != null) {
				current = current.next;
			}
			return current;
		}
	}
}

class QueueOpt extends LinkList {
	
	@Override
	public Student pop() {
		Student tmp = first;
		first = first.next;
		return tmp;
	}
	
	public Student peek(){
		return first;
	}
}

public class Question4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1 for Stack Operation and 2 for Queue Operation");
		LinkList obj;
		int value = input.nextInt();
		if (value == 1) {
			obj = new StackOpt();
			OperationImplement(input, obj);
		} else if (value == 2) {
			obj = new QueueOpt();
			OperationImplement(input, obj);
		} else {
			System.out.println(" Error Input value.");

		}
	}

	private static void OperationImplement(Scanner input, LinkList obj) {
		while (true) {
			System.out.println(
					"Munu :  1:push\n\t2:pop\n\t3:peek\n\t4:find by Id\n\t5:display\n\t6:delete by id\n\t7:sort");
			int key = input.nextInt();
			switch (key) {
			case 1:
				obj.add();
				break;
			case 2:
				Student student = obj.pop();
				if(student==null){
					System.out.println("Empty List.");
					break;
				}
				System.out.println("Student " + student.getName() + " is poped.");
				break;
			case 3:
				Student current = obj.pop();
				System.out.println("\tId: " + current.getId() + "\tName: " + current.getName() + "\tAddress: "
						+ current.getAddress() + "\tAge: " + current.getAge() + "\tProgram: " + current.getProgram());
				break;
			case 4:
				System.out.print("Enter Student Id:");
				int find = input.nextInt();
				obj.findById(find);
				break;
			case 5:
				obj.display();
				break;
			case 6:
				System.out.print("Enter Stuent ID:");
				obj.deleteFromStudentID(input.nextInt());
				break;
			case 7:
				obj.sort();
				System.out.println("List is sorted.\n");
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
