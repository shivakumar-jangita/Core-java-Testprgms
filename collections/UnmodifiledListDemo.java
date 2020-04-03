package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class UnmodifiledListDemo {

	public static void main(String[] args) {
		List al= new ArrayList();
		Collection c= new ArrayList();
		al.add(10);
		al.add(40);
		al.add(15);
		al.add(70);
		
		// TODO Auto-generated method stub
try {
		
		
	c=Collections.unmodifiableCollection(al);
		c.add(80);
		System.out.println(c);
		
		
	}
catch(Exception  we) {System.out.println(we);}

for(Object o:c)
{
System.out.println(o);	
}

	}
	
}
