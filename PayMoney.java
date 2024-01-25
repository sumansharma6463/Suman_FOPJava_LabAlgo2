package TransactionTargets;

import java.util.Scanner;

public class PayMoney {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Size of the transaction Array
		System.out.println("enter the size of transaction array: ");
		int size = scanner.nextInt();

		// Values of the transaction array
		int[] transactions = new int[size];
		System.out.println("enter the values of transaction array: ");
		for (int i = 0; i < size; i++) {
			transactions[i] = scanner.nextInt();

		}
		// Total number of targets to be achieved
		System.out.println("Enter the total number of targets that need to be achieved: ");
		int totalTargets = scanner.nextInt();

		// Values of the target
		for (int i = 1; i < totalTargets; i++) {
			System.out.println("Enter the value of target" + i + ": ");
			int target = scanner.nextInt();

			int sum = 0;
			int transactionsRequired = 0;

			// Iterate through transactions until the target is achieved
			for (int j = 0; j < size; j++) {
				sum += transactions[j];
				transactionsRequired++;

				if (sum >= target) {
					System.out.println("Target achieved after" + transactionsRequired + "transaction"
							+ (transactionsRequired > 1 ? "s" : ""));
					break;
				}

			}
			// Display message if target is not achieved
			if (sum < target) {
				System.out.println("Given target is not achieved");
			}
		}

		scanner.close();
	}
}
