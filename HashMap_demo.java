package Collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_demo {

	public static void main(String[] args) {
//---------create
				HashMap<Integer,String> hm=new HashMap<Integer,String>();
				System.out.println(hm);
				
//-------- Insert - insertion does not maintained order
				hm.put(1, "Shruti");
				hm.put(2, "Vaibhav");
				hm.put(3, "Sunil");
				hm.put(4, "Nilesh");
				System.out.println(hm);			
				hm.put(3, "Sunil Bhai");
				System.out.println(hm);
				hm.put(null, "xyz");
				System.out.println(hm);				
				hm.put(null, null);
				System.out.println(hm);
				
//--------remove/delete	method			
				hm.remove(null);
				System.out.println(hm);
				
//------ Contains method			
				System.out.println(hm.containsKey(2));
				System.out.println(hm.containsValue("Shruti"));
				
//------- Iterate through for each loop. we can not iterate thr iterator, as it is not part of collection			
				for ( Map.Entry<Integer, String> e :hm.entrySet()) {
					System.out.println(e.getKey()+" "+e.getValue());
					
				}// entrySet() returns a set view of all the mappings (entries) present in the hashmap
				
				
				
				
				
				
				
				
				
				
//				for(Map.Entry<Integer, String>  e: hm.entrySet())
//				{
//		         System.out.println(e.getKey()+"="+e.getValue());
//			    }
	
	}

}
