package question4;

import java.util.Date;

public class Account {
	final double TAX=2.4;
	final double INTEREST=3.24;
	
	private static int totalRegistation=0;
	private static double totalDepositOfBank=0;
	private static double totalWithDrawOfBank=0;
	private static double totalBalanceOfBank=0;
	
	
	private String customerName;
	private String address;
	private String phoneNumber;
	private Date accountOpenDate;
	private double netDeposit;
	private double netWithdraw;
	private double currentBalance;
	
	public void registration(String name,String address,String phoneNumber,Date date){
		this.customerName=name;
		this.address=address;
		this.phoneNumber=phoneNumber;
		this.accountOpenDate=date;
		
//		notification
		totalRegistation+=1;
		System.out.println("Registration successfull");
	}
	
//	public double checkBalance(){
////		return allDayDeposit-allWithDraw;
//	}
	
	public void deposit(double amount){
		this.netDeposit=amount;
		totalDepositOfBank+=amount;	
		System.out.println("Deposit successfull");
	}
	
	public void withdraw(double amount){
		this.netWithdraw=amount;
		totalDepositOfBank-=amount;	
		System.out.println("Withdraw successfull");
	}
	
	
}
