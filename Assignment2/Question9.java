package questions;

import java.util.Scanner;

/*Consider the following code snippet.
 * 
 
if (aNumber >= 0)
    if (aNumber == 0)
        System.out.println("first string");
else System.out.println("second string");
System.out.println("third string");

a. What output do you think the code will produce if aNumber is 3?
b. Write a test program containing the previous code snippet; make aNumber 3. What is the output of the program? 
Is it what you predicted? Explain why the output is what it is; in other words,
 what is the control flow for the code snippet?
c. Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand.
d. Use braces, { and }, to further clarify the code.
*/


//Answer:
//	a) 	second string 
//		third string
// 	b)	This is because if and else cover only one single statement if its statement is not
//		covered with {}. In our case, 1st if cover if inside it and else is act like inside else.
//		flow is like 1) check (aNumber >= 0) then its true 2) flow again check (aNumber == 0) but its 
//		false then it move to else statement which is not covered with {}. even it looks else of 
//		outer if. finally execute last statement.



public class Question9 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int aNumber = input.nextInt();
		
		if (aNumber >= 0)
		    if (aNumber == 0){
		        System.out.println("first string");
		    }
		    else{ 
		    	System.out.println("second string");
		    }
		System.out.println("third string");
	}
	
}
