/*
 * Cathrine bought 1000 shares of stock at a price of $25.50 per share. She must pay her stock broker 
 * a 2 percent commission for the transaction. Write a program that calculates and display following:
The amount paid for the stock alone (without commission)
The amount of commission
The total amount paid (with commission)
 */

package assignmentFirst;

import javax.swing.JOptionPane;

public class Question5 {

	public static void main(String[] args) {
		int totalShare = 1000;
		double eachShareCost = 25.50;
		double commissionTransaction =2;
		
//		totalStock cost
		double totalStockCost = totalShare*eachShareCost;
		JOptionPane.showMessageDialog(null, "Total amound paid for stock: $"+totalStockCost);
		
//		transaction commission amount
		double totalTransactionCost = totalStockCost*(double)commissionTransaction/100;
		JOptionPane.showMessageDialog(null, "Total transaction amount is : $"+totalTransactionCost);
		
//		total investment 
		double totalStoctCostWithTax = totalStockCost+totalTransactionCost;
		JOptionPane.showMessageDialog(null, "Total investment of stock : $"+totalStoctCostWithTax);
		
	}

}
