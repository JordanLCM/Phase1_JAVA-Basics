package Phase1_JB;

public class Phase1_JBasics002_Typecasting {

	public static void main(String[] args) {
		int i = 10;
		double d;
		//can store values with decimal point
		d = 10.5;
		int a;
		a = (int) d;
		System.out.println(a);
		
		int x = 50;
		short y = 2;
		long z;
		
		//implicit convert
		z= x;
		z = y;
		
		//explicit convert
		x = (int) z; 
		y = (short) z;
		
		//single character, single quotation ''
		char c = 'a';
		System.out.println(c);
		
		//value of character
		int myInt = c;
		System.out.println(myInt);
		
		//will show decimal point
		float myFloat = c;
		System.out.println(myFloat);
		
		int myInta = 100;
		//string use double quotation ""
		String strCasting = Integer.toString(myInta);
//		String strCasting = String.valueOf(myInta);
		System.out.println(strCasting);
	}
}
