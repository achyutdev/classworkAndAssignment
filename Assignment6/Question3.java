import java.util.Scanner;

/*
 * Write a program which has recursive function that can compute greatest common divisor
 */

class GCD{
	public int greatComDiv(int num1, int num2)
	{
		  if(num1 == 0 || num2 == 0) 
			  return num1+num2; 
		  return greatComDiv(num2,num1%num2);
		}
}
public class Question3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter two number\n a :");
		int n1 = input.nextInt();
		System.out.print(" b :");
		int n2 = input.nextInt();
		
		GCD gcd = new GCD();
		System.out.print("Greatest common divider is :"+gcd.greatComDiv(n1, n2));
	}
	
	
}
