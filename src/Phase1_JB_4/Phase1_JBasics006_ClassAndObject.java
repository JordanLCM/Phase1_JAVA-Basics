package Phase1_JB_4;

public class Phase1_JBasics006_ClassAndObject {

	int a = 100;
	int b = 150;

//	OR

//	static int a = 100;
//	static int b = 150;

//	public static void main(String[] args) {
//		Phase1_JBasics006_ClassAndObject myCObj = new Phase1_JBasics006_ClassAndObject();
//		System.out.println(myCObj.a + myCObj.b);
//	}

//	OR ------

//	public static void main(String[] args) {
//		Phase1_JBasics006_ClassAndObject myCObj = new Phase1_JBasics006_ClassAndObject();
//		myCObj.addition();
//	}

//	public void addition() {
//	System.out.println(a * b);
//}

//	OR ------

//	public static void main(String[] args) {
//		Phase1_JBasics006_ClassAndObject myCObj = new Phase1_JBasics006_ClassAndObject();
//		myCObj.addition(10, 10);
//	}
//
//	public void addition(int a, int b) {
//		System.out.println(a * b);
//	}

//	OR

//	public static void main(String[] args) {
//		Phase1_JBasics006_ClassAndObject myCObj = new Phase1_JBasics006_ClassAndObject();
//		myCObj.addition(10, 10, "Passed!");
//	}
//
//	public void addition(int a, int b, String strArg) {
//		System.out.println(a * b);
//		System.out.println("Arguement is = " + strArg);
//	}

//	OR

//	public static void main(String[] args) {
//		Phase1_JBasics006_ClassAndObject myCObj = new Phase1_JBasics006_ClassAndObject();
//		int myInt = myCObj.addition(10, 10);
//		System.out.println(myInt);
//	}
//
//	public int addition(int a, int b) {
//		int addition = a + b;
//		return addition;
//	}

//	OR

	public static void main(String[] args) {
		Phase1_JBasics006_ClassAndObject myCObj = new Phase1_JBasics006_ClassAndObject();
		String myString = myCObj.addition("Simplilearn");
		System.out.println(myString);
	}

	public String addition(String strArg) {
		return "Hello " + strArg;
	}
}