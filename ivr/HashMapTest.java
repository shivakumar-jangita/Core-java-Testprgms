package ivr;

import java.util.HashMap;
import java.util.Map;

import collections.Employee;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Employee, String> map = new HashMap<>();
		Employee e1 = new Employee(1, "s", "sap");
		Employee e2 = new Employee(2, "t", "Eric");
		Employee e3 = new Employee(3, "a", "Tcs");
		map.put(e1, "Siva");
		map.put(e2, "Jangita");
		map.put(e3, "jitu");

		for (Map.Entry<Employee, String> m : map.entrySet()) {
			System.out.println(m.getKey().getId() + "-->" + m.getKey().getName());
		}

		System.out.println(map.get(new Employee(1, "s", "sap")));
		System.out.println(map.get(e3));

	}

}
