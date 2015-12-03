package questions;

import javax.swing.JOptionPane;

public class Question5 {

	public static void main(String[] args) {
		int upperBound =Integer.parseInt(JOptionPane.showInputDialog("Enter upperbound number :"));
		long sum =0;
		for (int i = 1; i <= upperBound; i++) {
			sum+=i;
		}
		JOptionPane.showMessageDialog(null, "Sum :"+ sum+ "\n"
				+ 	"Average: " + sum/upperBound);
	}

}
