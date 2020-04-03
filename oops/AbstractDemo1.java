package oops;

abstract class Base
{
	  public String nonAbstractMethodOne(String param1,String param2){
	        String param = param1 + param2;
	        return param;
	    }

	    public static void nonAbstractMethodTwo(String param){
	        System.out.println("Value of param is "+param);
	    }
}
public class AbstractDemo1 extends Base {
	public static void main(String...d)
	{
		AbstractDemo1 aa= new AbstractDemo1();
	System.out.println(aa.nonAbstractMethodOne("SA", "P"));
	}
	
}
