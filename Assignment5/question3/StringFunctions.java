package question3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class StringFunctions {
	
	public String copy(String src,String des){
		return des=src;
	}
	
	public int length(String str){
		return str.length();
	}
	
	public char[] character(String str){
		char[] charArray = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			charArray[i]=str.charAt(i);
		}
		return charArray;
	}
	
	public String concatination(String src, String dst){
		return dst.concat(src);
	}
	
	public String substring(String src, int bigenIndex, int lastIndex){
		return src.substring(bigenIndex,lastIndex);
	}
	
	public Date stringTODate(String str) throws ParseException{
		DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);
		return format.parse(str);
	}

}
