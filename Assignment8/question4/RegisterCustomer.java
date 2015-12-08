package question4;

import java.util.Scanner;

public class RegisterCustomer extends Customer {

	public void payment() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of items:");
		int num = input.nextInt();
		double sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.println("Enter " + (i + 1) + " Items Name:");
			if (i == 0)
				input.nextLine();
			String name = input.nextLine();
			items[i] = name;
			System.out.print("Enter Items " + (i + 1) + " Cost:");
			double cost = Double.parseDouble(input.nextLine());
			sum += cost;
		}
		this.totalCost = sum;
		this.costAfterDiscount = sum * 0.95;
	}

}
