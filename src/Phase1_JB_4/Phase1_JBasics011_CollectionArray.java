package Phase1_JB_4;

public class Phase1_JBasics011_CollectionArray {
	
	public static void main(String[] args) {
		int a[] = {1, 3, 5, 8, 10, 13, 16, 20};
		//index starts from 0
		System.out.println(a[3]);
		System.out.println("-------------------------");
		
		a[3] = 70;
		//value will change due to above variable
		System.out.println(a[3]);
		System.out.println("-------------------------");
		
		//length of name of number in this case 70 = seventy (8 characters)
		System.out.println(a.length);
		System.out.println("-------------------------");
		
								//0		//1		//2		//3		//4		//5			//6		//7		//8	//9
		String strArray[] = {"Jordan","Kian","Ancore","Wong","Terence","Vincent","Wanhui","John","Jimmy","YK"};
		System.out.println(strArray[5]);
		System.out.println("-------------------------");
		
		for (int b = 0; b < strArray.length; b++) {
			System.out.println(strArray[b]);
		}
		System.out.println("-------------------------");
		
						//0		//1			//2 	(inside curly brackets count the indexes again, 0,1,2)
		int twoD[][] = {{1,2,3},{5,10,20},{15,25,35}};
		System.out.println(twoD[2][1]);
		System.out.println("-------------------------");
		
		for (int c = 0; c < twoD.length; c++) {
			for (int c2 = 0; c2 < twoD[c].length; c2++) {
				System.out.println(twoD[c][c2]);
			}
			System.out.println("-------------------------");
		}
	}
}
