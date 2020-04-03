package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class HashMapStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> ll = new ArrayList<Student>();

		ll.add(new Student(100, "Apple"));
		ll.add(new Student(90, "PinaApple"));
		ll.add(new Student(50, "Greape"));
		ll.add(new Student(300, "Mango"));

		Collections.sort(ll, new compratorDemo());
		for (Student ff : ll) {
			/* only id will print */
			System.out.println(":::" + ff.id+":::"+ff.name);

			/* only name will print */

			// System.out.println(":::"+ff.name);
		}
	}
}

class compratorDemo implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Student f1 = (Student) obj1;
		Student f2 = (Student) obj2;

		return ((Integer) f2.id).compareTo(f1.id);
	}
}
