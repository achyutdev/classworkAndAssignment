package question4;

public class Customer {
	protected String[] items=new String[4];
	protected double totalCost;
	protected double costAfterDiscount;
	
	public void showBill(){
		System.out.println("========Billing===========");
		System.out.println("Items: ");
		int i =1;
		for (String string : items) {
			System.out.print("   "+i+" :  ");
			System.out.println(string);
			i++;
		}
		System.out.println("===========================");
		System.out.println("Total cost : "+this.totalCost);
		System.out.println("Discount % : 5%");
		System.out.println("Total Payment Cost: "+ this.costAfterDiscount);
		System.out.println("===========================");
	}
	
}
