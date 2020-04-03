package oops;
class p3
{
	protected void m1()
	{
		System.out.println("Parent-m1 impl");
	}
	
}
class  c3 extends p3
{
	public void m1()
	{
		System.out.println("Child class method is calling here!");
		
	}
}

public class Test4 {

	public static void main(String[] args) {
		c3 cc= new c3();
		cc.m1();
		// TODO Auto-generated method stub

	}

}
