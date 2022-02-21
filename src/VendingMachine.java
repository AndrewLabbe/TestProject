import java.util.Scanner;

public class VendingMachine {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Welcome to the virtual vending machine! Listed below are your options for what snack you would like. Please enter in the number assoiciated with the snack.");
		
		Snack snack1 = new Snack("Lays Original", 2.00);
		Snack snack2 = new Snack("BBQ Fritos", 1.50);
		Snack snack3 = new Snack("Veggie Straws", 1.80);
		Snack snack4 = new Snack("Sour Patch Kids", 2.20);
		Snack snack5 = new Snack("Twix Bar", 2.00);
		Snack snack6 = new Snack("Nutri-Grain Bar", 2.00);
		
		
		System.out.println("1: " + snack1.getName() + ", " + "2: " + snack2.getName() + ", " + "3: " + snack3.getName() + ", " + "4: " + snack4.getName() + ", " + "5: " + snack5.getName() + ", " + "6: " + snack6.getName());
		int choice = 0;
		boolean chosen = false;
		double payment = 0.0;
		double change = 0.0;
		while (!chosen) {
			choice = userInput.nextInt();
			if (choice == 1) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					if (payment < snack1.getPrice()) {
						System.out.println("Not enough money entered please try again");
					}
				} while (payment < snack1.getPrice());
				change = payment - snack1.getPrice();	
				chosen = true;
			}
			else if (choice == 2) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					if (payment < snack2.getPrice()) {
						System.out.println("Not enough money entered please try again");
					}
				} while (payment < snack2.getPrice());
				change = payment - snack2.getPrice();	
				chosen = true;
			}
			else if (choice == 3) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					if (payment < snack3.getPrice()) {
						System.out.println("Not enough money entered please try again");
					}
				} while (payment <= snack3.getPrice());
				change = payment - snack3.getPrice();	
				chosen = true;
			}
			else if (choice == 4) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					if (payment < snack4.getPrice()) {
						System.out.println("Not enough money entered please try again");
					}
				} while (payment < snack4.getPrice());
				change = payment - snack4.getPrice();	
				chosen = true;
			}
			else if (choice == 5) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					if (payment < snack5.getPrice()) {
						System.out.println("Not enough money entered please try again");
					}
				} while (payment < snack5.getPrice());
				change = payment - snack5.getPrice();	
				chosen = true;
			}
			else if (choice == 6) {
				System.out.println("Please enter the payment amount, only whole dollars allowed");
				do {
					payment = userInput.nextDouble();
					if (payment < snack6.getPrice()) {
						System.out.println("Not enough money entered please try again");
					}
				} while (payment >= snack6.getPrice());
				change = payment - snack6.getPrice();	
				chosen = true;
			}
			else {
				System.out.println("Invalid response");
			}
		}
		
		System.out.println("Thank you for your purchase here is your change: " + String.format("%.2f", change));
		
		
		
		System.out.println("Snack " + choice + " is a good choice!");
		
		
	}
}
