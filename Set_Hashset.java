package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_Hashset {

	public static void main(String[] args) {
		
		//CRUD Operation
		
		//how to create
		Set<String> hs=new HashSet<String>(); // object creation and upcasting
		
		// check set is empty or not
		System.out.println(hs.isEmpty());
		System.out.println();
		//how to insert an element 
		//insertion is randomly, it does not insert indexbased
		hs.add(null);
		hs.add("Apple");
		hs.add("Kiwi");
		hs.add("Mango");
		hs.add("Orange");
		hs.add("DragonFruit");
		hs.add("Apple");            // Duplicates not allowed
		hs.add("Jackfruit");
		hs.add(null);				//  only 1 Null value allowed
		System.out.println(hs);
		System.out.println();
		
		// check set is empty or not
				System.out.println(hs.isEmpty());
		
		// size/length of set
		System.out.println(hs.size());
		
		//access element of set for Each loop
//		for(String str:hs) {
//			System.out.println(str);
//		}
		
		//iterate through iterator
		Iterator it = hs.iterator();
		while(it.hasNext()) {
			  System.out.println(it.next());
			}
		
		

		// Check the element present inside the set
		System.out.println(hs.contains("Mango"));
	}

}
