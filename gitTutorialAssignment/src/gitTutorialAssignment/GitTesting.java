package gitTutorialAssignment;

public class GitTesting {

	public static void main(String[] args) {
		System.out.println("Test");

		int resAdd = addition(3, 5);
		System.out.println("Addition Result:" + resAdd);

		int resSub = subtraction(5, 3);
		System.out.println("Subtraction Result:" + resSub);

		int resDiv = division(6, 2);
		System.out.println("Divivsion Result:" + resDiv);

		int resMul = multiply(2, 5);
		System.out.println("Multiply Result:" + resMul);

		int resSquare = square(2);
		System.out.println("Square Result" + resSquare)
	}

	public static int addition(int a, int b) {
		return a + b;
	}

	public static int division(int a, int b) {
		return a / b;
	}

	public static int multiply(int a, int b) {
		return a * b;
	}

	public static int subtraction(int a, int b) {
		return a - b;
	}
	public static int square(int a){
		return a*a;
	}
}
