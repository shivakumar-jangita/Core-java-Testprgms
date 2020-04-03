package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmplistSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		
			list.add(new Employee("ashok", 100, 20));
			list.add(new Employee("kumar", 101, 21));
			list.add(new Employee("jangita", 102, 22));
			list.add(new Employee("jithesh", 103, 23));
			list.sort(Comparator.comparing(Employee::getName));
			
			
			List<Employee> sortList=list.stream().sorted((s1,s2)->s2.getName().compareTo(s1.getName())).collect(Collectors.toList());
			
			sortList.forEach(System.out::println);
			
			
		
		
		
		
		
		
		
		
	}

}
