package collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class NullHashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
		//Map<String, Integer> hm= new TreeMap<>();
		Set hm= new TreeSet();
		hm.add(2);
		hm.add(null);
	//Map<String, Integer> hm= new TreeMap<>();
		//hm.put(null,1);
		//hm.put("1",2);
	//	hm.put("2",null);
		//hm.put(null, 1);
		//hm.put(null, 2);
		//hm.put("q", 2);
		System.out.println(hm);
	
	}
	catch(Exception e)
	{
		
	}
	}
}
