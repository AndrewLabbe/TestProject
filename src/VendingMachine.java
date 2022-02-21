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
		while (!chosen) {
			choice = userInput.nextInt();
			if (choice == 1) {
				
				chosen = true;
			}
			else if (choice == 2) {
			
				chosen = true;
			}
			else if (choice == 3) {
				
				chosen = true;
			}
			else if (choice == 4) {
				
				chosen = true;
			}
			else if (choice == 5) {
				
				chosen = true;
			}
			else if (choice == 6) {
				
				chosen = true;
			}
			else {
				System.out.println("Invalid response");
			}
		}
		
		
	}
}
