package Day19Homework;

public class Problem1 {
	
	public static void main(String[] args) {
		
		boolean getResult = isEqual("sdet", "SDET");
		System.out.println(getResult);
		
		boolean getResult1 = isEqual("testing", "testing");
		System.out.println(getResult1);
		
		boolean getResult2 = isEqual("java", "java");
		System.out.println(getResult2);
		
		boolean getResult3 = isEqual("java", "java Programming");
		System.out.println(getResult3);
	}

	
	static boolean isEqual(String strOne, String strTwo) {
		
		boolean result = false;
		
		if(strOne.equals(strTwo)) {
			result = true;
		}
		return result;
		
	}
}
