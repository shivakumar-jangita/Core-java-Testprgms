package java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Predicate<String> p=s->s.length()>5;
Predicate<Integer> p1=I->I+I>5;
System.out.println(p1.test(6));
System.out.println(p.test("siva"));
Function<Integer, Integer> f=i->i*i;
System.out.println(f.apply(5));

	}

}
