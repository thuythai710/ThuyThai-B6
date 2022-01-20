package Day19Homework;

public class Problem6 {
	
	public static void main(String[] args) {
		
		String getResult = combineStr("day","ONE","work","HOURS");
		System.out.println(getResult);
		
		String getResult1 = combineStr("week","weekend","monday","Tuesday");
		System.out.println(getResult1);
		
		String getResult2 = combineStr("restoN","vA","baltiMORE","MD");
		System.out.println(getResult2);
		
		String getResult3 = combineStr("java","is","fun","LEARNING");
		System.out.println(getResult3);
	};
	
	protected static String combineStr(String strOne, String strTwo, String strThree, String strFour) {
			
		String newtr1 = (strOne.toUpperCase()).concat(strTwo.toLowerCase());
		
		String newtr2 = (strThree.toUpperCase()).concat(strFour.toLowerCase());
		
		String result = newtr1.concat(newtr2);
	
		return result;	
	}
}
