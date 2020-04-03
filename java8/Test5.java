package java8;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Consumer<String> c=s->System.out.println(s);

c.accept("siua");
c.accept("kumar");
Supplier<String> s=()->{
	String[] s1={"siva","jithesh","yashika","Radha"};
	
	int x=(int)(Math.random()*3+1);
	return s1[x];
			
};
System.out.println(s.get());
System.out.println(s.get());
System.out.println(s.get());
System.out.println(s.get());

	}

}
