package Phase1_JB_2;

public class Phase1_JBasics_AccessModifier {

	public static void main(String[] args) {

		// referencing variables from Phase1_JBasics_2nd
		Phase1_JBasics_1st myCObj = new Phase1_JBasics_1st();
		System.out.println(myCObj.b);

		// public
		int c = myCObj.a * myCObj.b;
		System.out.println("Public = " + c);

		// private
//		int d = myCObj.z * myCObj.x;
//		System.out.println(c);
		System.out.println("Private can only use in it's own class file");

		// protected
		int e = myCObj.p * myCObj.o;
		System.out.println("Protected = " + e);
	}
}
