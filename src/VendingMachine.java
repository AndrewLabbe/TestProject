import java.util.Scanner;

public class VendingMachine {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the virtual vending machine! Listed below are your options for what snack you would like. Please enter in the number assoiciated with the snack.");
		
		Snack snack1 = new Snack("Lays Original", 2.00);
		Snack snack2 = new Snack("BBQ Fritos", 1.50);
		Snack snack3 = new Snack("Veggie Straws", 1.80);
		Snack snack4 = new Snack("Sour Patch Kids", 2.20);
		Snack snack5 = new Snack("Twix Bar", 2.20);
		Snack snack6 = new Snack("Nutri-Grain Bar", 1.50);
		
		
		System.out.println("1: " + snack1.getName() + " $" + snack1.getPrice() + "0, " + "2: " + snack2.getName() + " $" + snack2.getPrice() + "0, " + "3: " + snack3.getName() + " $" + snack3.getPrice() + "0, " + "4: " + snack4.getName() + " $" + snack4.getPrice() + "0, " + "5: " + snack5.getName() + " $" + snack5.getPrice() + "0, " + "6: " + snack6.getName() + " $" + snack6.getPrice() + "0, ");
		int choice = 0;
		boolean chosen = false;
		double payment = 0.0;
		double total = 0.0;
		double change = 0.0;
		while (!chosen) {
			choice = userInput.nextInt();
			if (choice == 1) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					total += payment;
					if(payment != 1) {
						System.out.println("Error, this machine only takes $1 bills");
						total -= payment;
					}
					else if (total < snack1.getPrice()) {
						System.out.println(total + "0 current balance, keep inserting bills.");
					}
				} while (total < snack1.getPrice() || payment != 1);
				change = total - snack1.getPrice();	
				chosen = true;
			}
			else if (choice == 2) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					total += payment;
					if(payment != 1) {
						System.out.println("Error, this machine only takes $1 bills");
						total -= payment;
					}
					else if (total < snack2.getPrice()) {
						System.out.println(total + "0 current balance, keep inserting bills.");
					}
				} while (total < snack2.getPrice() || payment != 1);
				change = total - snack2.getPrice();	
				chosen = true;
			}
			else if (choice == 3) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					total += payment;
					if(payment != 1) {
						System.out.println("Error, this machine only takes $1 bills");
						total -= payment;
					}
					else if (total < snack3.getPrice()) {
						System.out.println(total + "0 current balance, keep inserting bills.");
					}
				} while (total < snack3.getPrice() || payment != 1);
				change = total - snack3.getPrice();	
				chosen = true;
			}
			else if (choice == 4) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					total += payment;
					if(payment != 1) {
						System.out.println("Error, this machine only takes $1 bills");
						total -= payment;
					}
					else if (total < snack4.getPrice()) {
						System.out.println(total + "0 current balance, keep inserting bills.");
					}
				} while (total < snack4.getPrice() || payment != 1);
				change = total - snack4.getPrice();	
				chosen = true;
			}
			else if (choice == 5) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					total += payment;
					if(payment != 1) {
						System.out.println("Error, this machine only takes $1 bills");
						total -= payment;
					}
					else if (total < snack5.getPrice()) {
						System.out.println(total + "0 current balance, keep inserting bills.");
					}
				} while (total < snack5.getPrice() || payment != 1);
				change = total - snack5.getPrice();	
				chosen = true;
			}
			else if (choice == 6) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					total += payment;
					if(payment != 1) {
						System.out.println("Error, this machine only takes $1 bills");
						total -= payment;
					}
					else if (total < snack6.getPrice()) {
						System.out.println(total + "0 current balance, keep inserting bills.");
					}
				} while (total < snack6.getPrice() || payment != 1);
				change = total - snack6.getPrice();	
				chosen = true;
			}
			else {
				System.out.println("Invalid response");
			}
		}
		
		System.out.println("You have put in " + total + " dollars, would you like to purchase Snack " + choice + "?");
		Scanner sc = new Scanner(System.in);
		String res = sc.nextLine();
		
		if(res.toLowerCase().contains("no"))
			System.out.println("Okay then, here is your " + total + " dollars back.");
		else {
			System.out.println("Thank you for your purchase here is your change: " + String.format("%.2f", change));
			System.out.println("Snack " + choice + " is a good choice!");
		}
		
		sc.close();
		userInput.close();
	}
}