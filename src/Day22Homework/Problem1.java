package Day22Homework;

public class Problem1 {

public static void main(String[] args) {
		
		Problem1 obj = new Problem1();
		
		
		String myResult = obj.toUpper("Pro");
		String myResult1 = obj.toUpper("java");
		String myResult2 = obj.toUpper(null);
		
		System.out.println(myResult);
		System.out.println(myResult1);
		System.out.println(myResult2);
		
	}
	
	String toUpper(String strOne) {
		
		String result = null;
		
		if( strOne != null) {
			
			result = strOne.toUpperCase();
		}
		
		return result;
	}
}
