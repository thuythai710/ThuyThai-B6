package Day19Homework;

public class Problem5 {

	public static void main(String[] args) {
		
		Problem5 obj = new Problem5();
		
		String goLower = obj.toLower("espn");
		System.out.println(goLower);
		
		String goLower1 = obj.toLower("SOCCER");
		System.out.println(goLower1);
		
		String goLower2 = obj.toLower("STRING CLASS");
		System.out.println(goLower2);

	}

	protected String toLower(String strOne) {
		String result = strOne.toLowerCase();

		return result;
	}
}
