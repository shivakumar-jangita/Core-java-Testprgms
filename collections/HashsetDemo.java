package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Student,String> hs= new HashMap<Student,String>();
		
		Student s1= new Student(100, "siva");
		Student s2= new Student(101, "kumar");
		Student s3= new Student(100, "siva");
		hs.put(s1,"test");
		hs.put(s2,"dev");
		hs.put(s3,"dev");
		for(Entry<Student, String> ss:hs.entrySet())
		{
			System.out.println(ss.getKey().getName()+"-"+ss.getKey().getId());
		}
		/*Iterator itr= hs.iterator();
		while(itr.hasNext())
		{
			Student ss= (Student)itr.next();
			System.out.println(ss.getName());
		}*/
		System.out.println(hs);
	}

}
