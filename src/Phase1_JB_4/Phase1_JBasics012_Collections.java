package Phase1_JB_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phase1_JBasics012_Collections {

	public static void main(String[] args) {
		List<Integer> intL = new ArrayList<Integer>();
		intL.add(500);
		intL.add(40);
		intL.add(75);
		intL.add(2);
		intL.add(230);
		intL.add(13);
		// manual way to add numbers into a List
		System.out.println(intL);
		Collections.sort(intL);
		// sorts in ascending order
		System.out.println(intL);
		Collections.reverse(intL);
		// sorts in reverse, descending order
		System.out.println(intL);
		// get by index 0,1,2
		System.out.println(intL.get(2));

		System.out.println("-------------------------");

		List<String> strL = new ArrayList<String>();
		strL.add("Hello");
		strL.add("Jordan");
		strL.add("Fire");
		strL.add("Many");
		strL.add("Big");
		strL.add("Hey");
		// manual way to add numbers into a List
		System.out.println(strL);
		Collections.sort(strL);
		// sorts in according to alphabet order ABCDEFG...
		System.out.println(strL);
		Collections.reverse(strL);
		// sorts in reverse, ZYXW...
		System.out.println(strL);
		// get by index 0,1,2
		System.out.println(strL.get(2));

		System.out.println("-------------------------");

//			Map<String, String> myM = new HashMap<>();
//			myM.put("Name", "Jordan");
//			myM.put("Name2", "Jord");
//			myM.put("Name3", "Jor");
//			myM.put("Name4", "Dan");
//			myM.put("Name5", "Ord");
//			
//			System.out.println(myM.get("Name"));
//			System.out.println(myM.get("Name5"));

//		OR
		
		Map<String, String> myM1 = mapMethod();
		System.out.println(myM1.get("Name"));
		System.out.println(myM1.get("Name5"));
	}

	public static Map<String, String> mapMethod() {
		Map<String, String> myM = new HashMap<>();
		myM.put("Name", "Jordan");
		myM.put("Name2", "Jord");
		myM.put("Name3", "Jor");
		myM.put("Name4", "Dan");
		myM.put("Name5", "Ord");
		return myM;
	}
}
