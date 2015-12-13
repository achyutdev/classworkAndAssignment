package question1;

import java.util.HashMap;
import java.util.Scanner;

class Student {
	private String name;
	private int id;
	private String program;
	private HashMap<String, Double> subMark = new HashMap<String, Double>();
	Scanner input = new Scanner(System.in);

	public Student(String name, int id, String program) {
		this.name = name;
		this.id = id;
		this.program = program;
		setMarkofStudent();
	}

	private void setMarkofStudent() {
		System.out.print("Enter No of Subject: ");
		int totalSubject = input.nextInt();
		for (int i = 0; i < totalSubject; i++) {
			System.out.print("Enter Subject Name:");
			input.nextLine();
			String sub = input.nextLine();
			System.out.print("Enter Mark of " + sub + " :");
			double mark = input.nextDouble();
			subMark.put(sub, mark);
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

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public HashMap<String, Double> getSubMark() {
		return subMark;
	}

	public void setSubMark(HashMap<String, Double> subMark) {
		this.subMark = subMark;
	}

}

public class Question1 {

	public static void main(String[] args) {
		HashMap<String, Student> studentlog = new HashMap<String, Student>();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out
					.println("Munu :  1:input student record\n\t2:Check Average Mark of Student");
			int key = input.nextInt();
			switch (key) {
			case 1:
				System.out.print("Enter Student ID: ");
				int id = input.nextInt();
				System.out.print("Enter Student Name:");
				input.nextLine();
				String name = input.nextLine();
				System.out.print("Enter Program: ");
				String program = input.nextLine();
				Student obj = new Student(name, id, program);
				studentlog.put(name, obj);
				System.out.println("Student " + name + " record is Filed");
				break;
			case 2:
				System.out.print("Enter Student Name:\n\n");
				input.nextLine();
				String stu = input.nextLine();
				Student student = studentlog.get(stu);
				System.out.println("===========================");
				System.out.println("       Student Details      ");
				System.out.println("===========================");
				HashMap<String, Double> studentDetail = student.getSubMark();
				double total = 0;
				for (String sub : studentDetail.keySet()) {
					System.out.println("   " + sub + " : "
							+ studentDetail.get(sub));
					total += studentDetail.get(sub);
				}
				System.out.println("===========================");
				System.out.println("   Total:" + total);
				System.out.println("   Average:" + total
						/ studentDetail.size());
				System.out.println("===========================");
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
