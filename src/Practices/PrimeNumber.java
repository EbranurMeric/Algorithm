package Practices;
public class PrimeNumber {

	public static void main(String[] args) {
		// Bazı sayıların asal olup olmadığı

		int[] nums = { 1234517, 859501, 53, 142 };
		for (int i = 0; i < nums.length; i++) {
			if (isPrime(nums[i])) {
				System.out.println(nums[i] + " is prime");
			}
		}
	}

// Returns the number of factors of the given integer.
	public static int countFactors(int number) {
		int count = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++; // i is a factor of the number
			}
		}
		return count;
	}

// Returns true if the given number is prime.
	public static boolean isPrime(int number) {
		return countFactors(number) == 2;
	}
}