package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashmapwithComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> map = new HashMap<>();
		Employee e1 = new Employee(101, "siva", "sap");
		Employee e2 = new Employee(201, "kumar", "sap");
		Employee e3 = new Employee(102, "jangita", "sap");
		map.put(e1, "Siva");
		map.put(e2, "kumar");
		map.put(e3, "Siva");
		map.put(e3, "uu");
		 System.out.println("e1- "+e1.hashCode());
		 System.out.println("e2- "+e2.hashCode());
		 System.out.println("e3- "+e3.hashCode());
		for (Entry<Employee, String> entry : map.entrySet()) {
			System.out.println(entry.getKey().getName() + "-" + entry.getKey().getId());

		}

		
		map.get(new Employee(201, "kumar", "sap"));
		System.out.println(map.get(e3));
		System.out.println(map.size());
	
		System.out.println(map.get(new Employee(201, "kumar", "sap")));
		
	}

}
