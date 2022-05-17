package week1.day2;

public class ArmstrongNumber {

	public static void main(String[] args) {

		int input = 153;
		int sum = 0;
		int orgnum = input;
		while (input > 0) {
			int rem = input % 10;
			sum += (rem * rem * rem);
			input /= 10;
		}

		System.out.println("Armstrong number: " + sum);
		if (orgnum == sum) {
			System.out.println("It is Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}

	}
}
