package Day19Homework;

public class Problem4 {

	public static void main(String[] args) {

		Problem4 obj = new Problem4();
		String goUpper = obj.toUpper("Pro");
		System.out.println(goUpper);
		
		String goUpper1 = obj.toUpper("java");
		System.out.println(goUpper1);
		
		String goUpper2 = obj.toUpper("java training");
		System.out.println(goUpper2);

	}

	String toUpper(String strOne) {

		String result = strOne.toUpperCase();

		return result;
	}
}
