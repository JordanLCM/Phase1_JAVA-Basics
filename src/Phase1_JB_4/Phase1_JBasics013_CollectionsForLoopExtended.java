package Phase1_JB_4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Phase1_JBasics013_CollectionsForLoopExtended {

	public static void main(String[] args) {

		List<String> strL = new ArrayList<String>();
		strL.add("Hello");
		strL.add("Jordan");
		strL.add("Fire");
		strL.add("Many");
		strL.add("Big");
		strL.add("Hey");
		
		//shows as a contained row of texts
		System.out.println(strL);
		
		//will show as a list
		for (String strData : strL) {
			System.out.println(strData);
		}
	}
}
