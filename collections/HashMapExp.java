package collections;

import java.util.Collections;
import java.util.HashMap;

public class HashMapExp {

	public static void main(String...h) {
		HashMap<Student, String> hm = new HashMap<Student, String>();
		
		Student s1 = new Student(1, "Jathin");
		Student s2 = new Student(2, "Jathin");
		Student s3=s1;
		hm.put(s1, "J");
		hm.put(s2, "J");
		
		System.out.println(hm);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());

	}

	
	
}
