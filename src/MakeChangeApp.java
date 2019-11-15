
public class MakeChangeApp {
	public static void main(String[] args) {

		// Variables
		double cost = 0;
		double tendered = 0;
		double change = 0;
		// Scanner
		java.util.Scanner sc = new java.util.Scanner(System.in);
		// Prompt for user
		System.out.print("Enter the cost of the item: ");
		cost = sc.nextDouble();

		System.out.print("Enter the amount tendered: ");
		tendered = sc.nextDouble();
		sc.close();
		// No change if correct amount input

		if (cost == tendered) {

			System.out.println("No change due.");
			System.exit(0);
		}
		if (tendered < cost) {
			System.out.println("Incorrect amount given.");
			System.exit(0);
		}
		// Calculate change
		change = tendered - cost;
		// Call change and denominations
		changeDue(cost, tendered, change);
	}

	// Calculate change and denominations
	private static void changeDue(double cost, double tendered, double change) {
		System.out.println("Amount: " + cost + " , " + "Tendered: " + tendered + " , " + "Change Due: " + change);
		System.out.println("Denominations Due: ");
		if (change >= 100) {
			int hundreds = (int) (change / 100);
			change = change % 100;
			if (hundreds == 1) {
				System.out.println(hundreds + " Hundred dollar bill");
			} else {
				System.out.println(hundreds + " Hundred dollar bills");
			}
		}
		if (change >= 50) {
			int fifties = (int) (change / 50);
			change = change % 50;
			if (fifties == 1) {
				System.out.println(fifties + " Fifty dollar bill");
			} else {
				System.out.println(fifties + " Fifty dollar bills");
			}
		}
		if (change >= 20) {
			int twenties = (int) (change / 20);
			change = change % 20;
			if (twenties == 1) {
				System.out.println(twenties + " Twenty dollar bill");
			} else {
				System.out.println(twenties + " Twenty dollar bills");
			}
		}
		if (change >= 10) {
			int tens = (int) (change / 10);
			change = change % 10;
			if (tens == 1) {
				System.out.println(tens + " Ten dollar bill");
			} else {
				System.out.println(tens + " Ten dollar bills");
			}
		}
		if (change >= 5) {
			int fives = (int) (change / 5);
			change = change % 5;
			if (fives == 1) {
				System.out.println(fives + " Five dollar bill");
			} else {
				System.out.println(fives + " Five dollar bills");
			}
		}
		if (change >= 1) {
			int ones = (int) (change / 1);
			change = change % 1;
			if (ones == 1) {
				System.out.println(ones + " One dollar bill");
			} else {
				System.out.println(ones + " One dollar bills");
			}
		}
		if (change >= .25) {
			double quarters = (int) (change / .25);
			change = change % .25;
			if (quarters == 1) {
				System.out.println((int) quarters + " Quarter");
			} else {
				System.out.println((int) quarters + " Quarters");
			}
		}
		if (change >= .1) {
			double dimes = (int) (change / .1);
			change = change % .1;
			if (dimes == 1) {
				System.out.println((int) dimes + " Dime");
			} else {
				System.out.println((int) dimes + " Dimes");
			}
		}
		if (change >= .05) {
			double nickels = (int) (change / .05);
			change = change % .05;
			if (nickels == 1) {
				System.out.println((int) nickels + " Nickel");
			} else {
				System.out.println((int) nickels + " Nickles");
			}
		}
		if (change >= .001) {
			double pennies = (int) (change / .009);
			change = change % .01;
			if (pennies == 1) {
				System.out.println((int) pennies + " Penny");
			} else {
				System.out.println((int) pennies + " Pennies");
			}
		}

	}
}
