package oops;

class p

{
	public void m1()
	{
		System.out.println("parent-class");
	}
	public void s1(int c)
	{
		System.out.println("parent -s1 calling -int");
	}

}
class c extends p
{
	public void m1()
	{
		System.out.println("chield-class");
	}
	
}
class r extends c
{
	
}
public class Test1 {

	public static void main(String...f)
	{
	/*p p1= new p();
	p1.m1();
	c c1= new c();
	c1.m1();
	c1.s1(10);*/
	p p2= new c(); 
		p2.m1();
		p2.s1(3);
		
		/*
		 * r r1= new r(); r1.m1(); r1.s1(1);
		 */	}
	}