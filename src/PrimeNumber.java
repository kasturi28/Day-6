import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Please enter the number....");

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int i = 0;
		int count = 0;

		if (n == 0 || n == 1) {
			System.out.println("The given number is not a prime number...");
		} else {

			for (i = 1; i <= n; i++) {

				if (n % i == 0) {

					count++;

				}
			}

			if (count == 2) {
				System.out.println("The given number is a prime number...");

			} else {

				System.out.println("The given number is not a prime number...");
			}

		}

	}

}
