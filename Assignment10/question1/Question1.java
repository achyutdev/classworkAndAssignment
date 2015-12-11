package question1;

import java.util.Scanner;
import java.util.Stack;

class StackImp{
	 public Stack<Integer> stack = new Stack<Integer>();
	 public void insert(int num){
		 stack.push(num);
	 }
	 public boolean find(int num){
		 return stack.contains(num);
	 }
	 public void delete(int num){
		 stack.remove(stack.indexOf(num));
	 }
	 public int findbyIndex(int index){
		 return stack.elementAt(index);
	 }
	 public void display(){
		 System.out.println(stack);
	 }
}
public class Question1 {

	public static void main(String[] args) {
		StackImp obj = new StackImp();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Munu :  1:insert\n\t2:find\n\t3:delete\n\t4:find by Index\n\t5:display");
			int key = input.nextInt();
			switch (key) {
			case 1:
				System.out.print("Enter integer Number:");
				int num = input.nextInt();
				obj.insert(num);
				System.out.println("Number " + num + " inserted.");
				break;
			case 2:
				System.out.print("Enter integer Number:");
				int find = input.nextInt();
				if (obj.find(find)) {
					System.out.println("Number " + find + " is Found.");
				}else{
					System.out.println("Number " + find + " is NOT Found.");
				}
				break;
			case 3:
				System.out.print("Enter integer Number:");
				int delete = input.nextInt();
				obj.delete(delete);
				System.out.println("Number " + delete + " Deleted.");
				break;
			case 4:
				System.out.print("Enter Index Number:");
				int index = input.nextInt();
				System.out.println("Number at Index "+index+" is " +obj.findbyIndex(index));
				break;
			case 5:
				System.out.print("Stack :");
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
