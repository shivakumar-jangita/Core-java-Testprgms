package java8;

public interface Interf {
	public static void main(String...sd)
	{
		System.out.println("Functional Interface is invoked");
		test t1= new test();
		t1.m1();
	}
	default  void m1()
	{
		System.out.println("Default method implemetations!!");
	}
	

}

class test
{
	public void m1()
	{
		int fact=1;
		for(int i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println("this is my own implementations!!"+fact);
	}
}