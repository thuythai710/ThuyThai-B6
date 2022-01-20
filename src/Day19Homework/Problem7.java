package Day19Homework;

public class Problem7 {

	public static void main(String[] args) {

		Problem7 obj = new Problem7();

		String getName = obj.helloTo("Denis");
		String getName1 = obj.helloTo("Malek");
		String getName2 = obj.helloTo("Sara");

		System.out.println(getName);
		System.out.println(getName1);
		System.out.println(getName2);

	}

	String helloTo(String strOne) {

		String result = "Hello " + strOne;

		return result;

	}
}
