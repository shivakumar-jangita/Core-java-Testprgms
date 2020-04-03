package oops;

public class Test {
public void m1(String s)
{
	System.out.println("String- veresion ::");
	
}
public void m1(int i)
{
	System.out.println("Int- veresion ::");
	
}
public static void main(String...ss)
{
	Test t=  new Test();
	t.m1("Siva");
	t.m1('a');
}

}
