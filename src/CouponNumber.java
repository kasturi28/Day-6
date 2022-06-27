import java.util.Random;

public class CouponNumber {

	public static void main(String[] args) {

		int n1 = 6;
		int n2 = 28;
		int n3 = 25;
		long count = 0;

		Random random = new Random();
		int n = random.nextInt();

		if (n1 == n || n2 == n || n3 == n) {

			count++;

			System.out.println("The number of random selection takes place =  " + count);

		}

	}

}
