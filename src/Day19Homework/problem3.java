package Day19Homework;

public class problem3 {

	public static void main(String[] args) {

		isEqualLength("Pro", "Ali");
		isEqualLength("java", "LearNinG");
		isEqualLength("java training", "java");
	}

	public static void isEqualLength(String strOne, String strTwo) {

		if (strOne.length() == strTwo.length()) {
			
			System.out.println(strOne.concat(strTwo) + " " + (strOne.length() + strTwo.length()));
			
		} else if (strOne.length() > strTwo.length()) {
			
			System.out.println(strOne.toUpperCase() + " " + strOne.length());
			
		} else if (strOne.length() < strTwo.length()) {
			
			System.out.println(strTwo.toLowerCase() + " " + strTwo.length());

		}
	}
}
