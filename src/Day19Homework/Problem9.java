package Day19Homework;

public class Problem9 {
	
	public static void main(String[] args) {
		
		Problem9 obj = new Problem9();
		boolean checkChar = obj.isThere("java training", "ini");
		boolean checkChar1 = obj.isThere("java training", "ava");
		boolean checkChar2 = obj.isThere("java training", "AVA");
		boolean checkChar3 = obj.isThere("java training", "Java");
		
		System.out.println(checkChar);
		System.out.println(checkChar1);
		System.out.println(checkChar2);
		System.out.println(checkChar3);
		
	}

	private boolean isThere(String strOne, String value) {
		
		boolean result = false;
		
		if(strOne.contains(value)) {
			result = true;
		}
		
		return result;
	}
}
