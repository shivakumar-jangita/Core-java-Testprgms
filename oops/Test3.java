package oops;

import java.io.IOException;

class p2
{
	public void m1() throws Exception
	{
		System.out.println("parent-method:exception block");
	}
}
class c2 extends  p2
{
	public void m1() throws IOException,InterruptedException
	{
		System.out.println("child-method:exception block");
	}
}
public class Test3 {
	public static void main(String...ds)throws Exception
	{
		//c2 c= new c2();
	c2 p= new c2();
		p.m1();
	}

}
