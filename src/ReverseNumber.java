import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number to be reversed..");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int rev;

		while (n > 0) {

			rev = n % 10;

			System.out.print(rev);

			n = n / 10;
		}

	}

}
