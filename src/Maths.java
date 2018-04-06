import java.util.Scanner;

public class Maths {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Two Numbers to calculate their Addition, Subtraction, Multipliction and Division");
		int num1 = input.nextInt();
		int num2 = input.nextInt();

		System.out.println("Addition = " + (addition(num1, num2)));
		System.out.println("Subtraction = " + (subtraction(num1, num2)));
		System.out.println("Multiplication = " + (multiplication(num1, num2)));
		System.out.println("Division = " + (division(num1, num2)));

	}

	public static int addition(int num1, int num2) {

		int ans = num1 + num2;
		return ans;
	}

	public static int subtraction(int num1, int num2) {

		int ans = num1 - num2;
		return ans;
	}

	public static int multiplication(int num1, int num2) {

		int ans = num1 * num2;
		return ans;
	}

	public static int division(int num1, int num2) {

		int ans = num1 / num2;
		return ans;
	}
}
