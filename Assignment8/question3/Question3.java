package question3;

public class Question3 {

	public static void main(String[] args) {
		
		String string1 = "Sample string.";
		String string2 = "Second string .";
		String string3 = "EverestMT";
		OperationClass opt = new OperationClass();
		char[] array = opt.stringToChar(string1);
		
		System.out.println("Max char : " + opt.maxChar(string3));
		System.out.println("Min char : " + opt.minChar(string3));
		
		String string4 =opt.stringConcat(string1, string3);
		System.out.println(string4);
		
		System.out.println("Reverse string :  " + opt.stringReverse(string3));
		System.out.println("String length : " + opt.stringLength(string3));
		
	}

}
