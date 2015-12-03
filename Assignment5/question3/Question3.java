/*
 * Create a class stringFunctions, which must have following functions in it:
String copy
String length
String to character
String concatenation
Sub string
String to date
Use return and argument passing wherever it’s applicable.
 */

package question3;

import java.text.ParseException;

public class Question3 {

	public static void main(String[] args) throws ParseException {
		
		String str1 = "This is implementation";
		String str2 = " of stringFunction class";
		String str3 = null;
		String date = "April 24, 1989";
		
		
		StringFunctions stringFun = new StringFunctions();
		
//		string copy 
		str3=stringFun.copy(str1, str3);
		System.out.println(str3);
		
//		string length
		System.out.println(stringFun.length(str2));
		
//		String to character
		char[] array = stringFun.character(str1);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
//		sub string
		System.out.println(stringFun.substring(str1, 3, 7));
		
//		Date
		System.out.println(stringFun.stringTODate(date));
	}

}
