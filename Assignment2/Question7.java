/*
 * Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), 
 * where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. 
 * The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
The average is 885.5
 */
package questions;

public class Question7 {
	public static void main(String[] agrs) {
		int i = 1;
		int j = 1;
		int feb;

		String msg = " 1 1";
		int sum = 0;
		double avg = 0;
		for (int k = 0; k < 20 - 2; k++) {
			feb = i+j;
			msg +=" "+feb;
			sum+=feb;
			i=j;
			j=feb;
		}
		
//		display all Fibonacci series
		System.out.println("Fibonacci Series : "+msg);
		
//		average 
		System.out.println("The average is "+(double)(sum/20));
		
	}
}
