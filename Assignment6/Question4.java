import javax.swing.JOptionPane;

/*
 * Write a program which has recursive function to detect if a given string is a palindrome or not
 */

class Palindrome {

	public boolean isPalindrome(String s) {
		if (s.length() == 0 || s.length() == 1)
			return true;
		
		if (s.charAt(0) == s.charAt(s.length() - 1))
			return isPalindrome(s.substring(1, s.length() - 1));

		return false;
	}
}

public class Question4 {

	public static void main(String[] args) {
		Palindrome pali = new Palindrome();
		
		String s = JOptionPane.showInputDialog("Enter string:");
		
		if(pali.isPalindrome(s)){
			JOptionPane.showMessageDialog(null, "Palindrome");
		}else{
			JOptionPane.showMessageDialog(null, "Not Palindrome");
		}
	}

}
