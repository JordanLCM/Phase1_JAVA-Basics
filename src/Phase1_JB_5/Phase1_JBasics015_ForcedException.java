package Phase1_JB_5;

public class Phase1_JBasics015_ForcedException {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Statement 1");
		// wait for 3 seconds
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Statement 2");
	}
}
