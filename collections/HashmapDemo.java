package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class HashmapDemo {

	public static void main(String[] args) {

		//HashMap hm = new HashMap();
		Map hm= new TreeMap();
		
		//Set hm= new TreeSet();
		
		hm.put(8,"sib");
		hm.put(null,"test");
		System.out.println(hm);
		//hm.put(null, 9);
		
	}

}
