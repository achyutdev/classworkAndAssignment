package question3;

public class OperationClass implements StringOperation,StringArray{
	
	
	@Override
	public char[] stringToChar(String str) {
		char[] charArray = new char[str.length()];
		for (int i = 0; i < charArray.length; i++) {
			charArray[i] = str.charAt(i);
		}
		return charArray;
	}

	@Override
	public char maxChar(String str) {
		char max= str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if(max<str.charAt(i)){
				max=str.charAt(i);
			}
		}
		return max;
	}

	@Override
	public char minChar(String str) {
		char min= str.charAt(0);
		for (int i = 0; i < str.length(); i++) {
			if(min>str.charAt(i)){
				min=str.charAt(i);
			}
		}
		return min;
	}

	@Override
	public String stringConcat(String src, String dst) {
		return src.concat(dst);
	}

	@Override
	public String stringReverse(String str) {
		String revSt="";
		for (int i = str.length()-1; i >=0 ; i--) {
			revSt+=str.charAt(i);
		}
		return revSt;
	}

	@Override
	public int stringLength(String str) {
		return str.length();
	}
	
}
