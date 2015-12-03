import java.util.Scanner;

//Write a program which has recursive function that can calculate the number of time a 
//character appeared in a string e.g. “This is a string”, if user entered s as character 
//recursive function need to return s appeared 3 times.
//		
class CharCount{
	
	 public int charCounter(String s, String c) {
		    if(s.length()==0) {
		        return 0;
		    }

		    if ((s.substring(0,1).equals(c))) {
		        return 1 + charCounter(s.substring(1), c);
		    }
		    return charCounter(s.substring(1), c);
		}
}

public class Question1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter String:");
		String string = input.nextLine();
		System.out.print("Enter Character:");
		String character = input.nextLine();
		
		CharCount charcount = new CharCount();
		System.out.println("Total Character in string is " + charcount.charCounter(string, character));
		
		
	}

}
