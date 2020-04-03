package oops;
class p1

{
private void m1()
{
	System.out.println("parent call");
}
}
class c1 extends p1
{
	private void m1()
	{
		System.out.println("chield call");
	}

}
public class Test2 {

	public  static void main(String...f)
	{
p1 p=  new p1();
//p.m1(); // private methods cont overriden in the chiled class
	}
	}

