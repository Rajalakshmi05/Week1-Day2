package week1.day2;

public class Calculator {
	public int add(int n1, int n2) {
		int n3;
		n3 = n1 + n2;
		return n3;

	}

	public double sub(double n1, double n2) {
		double n3;
		n3 = n1 - n2;
		return n3;
	}

	public double mul(double n1, double n2) {
		double n3;
		n3 = n1 * n2;
		return n3;
	}

	public int div(int n1, int n2) {
		int n3;
		n3 = n1 / n2;
		return n3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, 5));
		System.out.println(calc.sub(10, 5));
		System.out.println(calc.mul(5, 5));
		System.out.println(calc.div(10, 5));

	}

}
