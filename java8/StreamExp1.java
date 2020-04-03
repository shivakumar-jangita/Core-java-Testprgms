package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExp1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList=
				Arrays.asList(new Employee("siva",100,32),
						new Employee("kumar", 101, 30));
		
		List<Employee> list=empList.stream().limit(2).collect(Collectors.toList());
		list.forEach(System.out::println);

	}

}
