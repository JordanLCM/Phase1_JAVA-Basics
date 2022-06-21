package Phase1_JB_4;

public class Phase1_JBasics007_Constructor {

	//cannot return & cannot be static
	public Phase1_JBasics007_Constructor() {
		System.out.println("Constructor executed!");
	}
	
	public Phase1_JBasics007_Constructor(int a, int b) {
		System.out.println(a * b);
	}
}
