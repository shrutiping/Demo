package Collection;

import java.util.HashMap;

public class HashMap_occuraceOfchar {

	public static void main(String[] args) {

	String str="Hello World";
		
	   HashMap<Character,Integer> hm1=new  HashMap<Character,Integer>();	   
	   System.out.println(hm1);	   
	   char[] e = str.toCharArray(); //string converted to char array	   
	   for(char ch:e ) {  //ch- variable name of single element of array
//firstly hashmap is empty, so it will not enter in if, it will execute else. it will execute if only when multiple occurrence.
		   if(hm1.containsKey(ch)) { // it check whether the key is present or not
			   Integer ref = hm1.get(ch);
			   hm1.put(ch, ref+1);
		   }
		   else
		   { hm1.put(ch, 1);
		   
		   }
		   System.out.println(hm1);

	   }
	   
	}
		
}




