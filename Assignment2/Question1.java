package questions;
/*
 * Show two ways to concatenate the following two strings together 
 * to get the string "Hi, mom.":
 */

public class Question1 {

	public static void main(String[] args) {
		String hi 	= 	"Hi";
		String mom 	= 	"mom";
		
		System.out.println(hi + ", "+ mom +".");
		System.out.println(hi.concat(", ").concat(mom).concat("."));
	}

}
