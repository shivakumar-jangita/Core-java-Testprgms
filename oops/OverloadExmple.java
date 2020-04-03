package oops;

public class OverloadExmple {
	
	public void m1(int x)
	{
		System.out.println("intx method");
	}
	
	public void m1(String x)
	{
		System.out.println("String metod");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadExmple oe= new OverloadExmple();
		oe.m1(10);
		oe.m1("siva");
		
	}

	
}


