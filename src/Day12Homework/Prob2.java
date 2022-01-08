package Day12Homework;

public class Prob2 {

	public static void main(String[] args) {

		boolean getResult = multipleOf(3);
		boolean getResult1 = multipleOf(10);
		boolean getResult2 = multipleOf(8);
		boolean getResult3 = multipleOf(27);
		boolean getResult4 = multipleOf(56);

		System.out.println(getResult);
		System.out.println(getResult1);
		System.out.println(getResult2);
		System.out.println(getResult3);
		System.out.println(getResult4);
	}

	public static boolean multipleOf(int num) {

		boolean result = false;

		if (num % 3 == 0 || num % 5 == 0) {
			result = true;
		} else {
			result = false;
		}

		return result;
	}
}
