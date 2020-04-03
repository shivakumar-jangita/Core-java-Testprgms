package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> al= new ArrayList<String>();
		al.add("Apple");
		al.add("Banana");
		al.add("Mango");
		al.add("watermilan");
		al.add("papaya");
		System.out.println("ArrayList Value:"+al);
	//	al.stream().forEach(s->System.out.println(s));
		al.stream().forEach(System.out::println);
List<String> ll= al.stream().filter(s->s.length()>=6).collect(Collectors.toList());
List<String> l2=al.stream().sorted().collect(Collectors.toList());
List<String> l3=al.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
long l4=al.stream().count();
String  l5=al.stream().max((s1,s2)->s1.compareTo(s2)).get();
String  l6=al.stream().min((s1,s2)->s1.compareTo(s2)).get();

System.out.println("The sorted list is:"+l2);
System.out.println("Total count of list is:"+l4);
System.out.println("The customized sorted list is:"+l3);
System.out.println("The filtered list elements is :"+ll);
System.out.println("The Max String is :"+l5);
System.out.println("The Min String is :"+l6);

String[] str=al.stream().toArray(String[]::new);
for(String d:str){
System.out.println("From the list to toArry is :"+d);
		
	}
Stream<String> stream=Stream.of("Car","bus","jepp");
stream.forEach(System.out::println);

String[] arr={"India","US","AUS"};
Stream<String> in=Stream.of(arr);
in.forEach(System.out::println);

	}
}
