package ivr;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.sun.xml.internal.bind.v2.runtime.Name;

import collections.Student;

public class ComparatorList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Student> list=new ArrayList<>();
		list.add(new Student(100, "Siva"));
		list.add(new Student(101, "Kumar"));
		list.add(new Student(102, "Jangita"));
		System.out.println(list);
		Collections.sort(list,new MyComparator());
		for(Student ss:list)
		{
			System.out.println(ss.id);
			System.out.println(ss.name);
		}
		
		
		
	}

}
class MyComparator implements Comparator<Student>
{

	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		Student s=(Student)o1;
		Student s1=(Student)o2;
		//return ((String)s1.name).compareTo(s.name);
		return (s1.name).compareTo(s.name);
	}

	
	
}
