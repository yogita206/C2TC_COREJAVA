package javaset;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {

		
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		
		hm.put(10, "yogita");
		hm.put(11, "vaishnavi");
		hm.put(12, "kiran");
		hm.put(13, "sharvari");
		hm.put(14, "sanjana");
		//hm.put(null, "ishu");
		hm.put(null, null);
		hm.put(14, "ishu");
		hm.put(15, null);
		
	System.out.println(hm);
	
	
	System.out.println(hm.size());
	System.out.println(hm.get(14));
	System.out.println(hm.remove(12));
	System.out.println(hm);
	System.out.println(hm.containsValue("Sharvari"));
	System.out.println(hm.containsKey(12));
	
	System.out.println(hm.keySet());
	System.out.println(hm.values());
	

	}

}