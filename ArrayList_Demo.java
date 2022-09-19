package Collection;

import java.util.ArrayList;

public class ArrayList_Demo {

	public static void main(String[] args) {
		
//-------Create 		
		ArrayList al= new ArrayList();
//-------Insert
		al.add("Shruti");
		al.add("Swapnil");
		al.add("Sanavee");
		al.add(null);			
		al.add("Shraavya");
		al.add(null);		// multiple null values are accepted
		al.add("Sanavee");	// duplicate values accepted	
		System.out.println(al);
//-------Size
		System.out.println(al.size());
//-------isEmpty
		System.out.println(al.isEmpty());
//-------Contains
		System.out.println(al.contains("Sanavee"));
//------ Tofetch/read/access
		System.out.println(al.get(1));
		
		al.add(3, "Pingale");
		System.out.println(al);
//------- remove/delete
		al.remove(3);
		al.remove(5);
		al.remove(3);
		al.remove(4);
		System.out.println(al);
		al.set(0,"Shruti Pingale");
		System.out.println(al);
		
	}

	
}
