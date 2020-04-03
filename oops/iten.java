package oops;

abstract class vechical
{
	static
	{
		cost();
	}
	public static double cost() {
		System.out.println("abstarct method impl");
		double itencost=700000;
		System.out.println(itencost);
		return itencost;
	}
	
	public void drive()
	{
		System.out.println("concreate class  impl");
		
	}
}
public class iten  extends vechical{


	
	public static void main(String...d)
	{
		iten vv=  new iten();
		vv.drive();
		vv.cost();
		
	}

}
