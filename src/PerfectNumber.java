import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {

		int sum = 0, i;
		/*
		 * Taking input number from user
		 */
		System.out.println("Enter the number to be checked.. ");
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (i = 1; i < n; i++) {

			if (n % i == 0) {
				sum = sum + i;
			}

		}
		if (sum == n) {
			System.out.println("The given number is a perfect number");
		} else {
			System.out.println("The given number is not a perfect number");
		}
	}

}
