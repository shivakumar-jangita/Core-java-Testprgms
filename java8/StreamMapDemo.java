package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import collectionsTest.Student;

public class StreamMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Employee> al= new ArrayList<>();
al.add(new Employee("siva",100,20));
al.add(new Employee("kumnar",200,30));
al.add(new Employee("jangita",300,40));
al.add(new Employee("srini",100,60));

System.out.println(al);
List<Employee> ll=al.stream().sorted((e1,e2)->e2.getName().compareTo(e1.getName())).collect(Collectors.toList());
ll.forEach(System.out::println);
	}

}
