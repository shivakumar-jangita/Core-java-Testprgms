package SivaTestPrograms;

public class TestCon {
	
	TestCon()
	{
		this(10);
		System.out.println("Default constructor calling");
	}
	
	TestCon(int a)
	{
		
		this(10,"raj");
		System.out.println("single parameters constructor calling-"+a);
	}

	TestCon(int a,String name)
	{
		this("siva");
		
		System.out.println("two parameters constructor calling-  "+a+""+name);
		
		
	}
	
	TestCon(String str)
	{
		
		System.out.println("Single String parameters constructor calling-  "+str);
		
		
	}
	
	public static void main(String[] args) {
		
		TestCon t= new TestCon();
		
	}

}
