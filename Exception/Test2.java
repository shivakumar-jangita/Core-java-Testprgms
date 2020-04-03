package Exception;

public class Test2 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
		{
			String siva=null;
			System.out.println(siva.length());
		}
catch(Exception e)
{
	
	e.printStackTrace();
	e.getMessage();
	e.toString();
	
}
finally
{
	System.out.println("finnaly block");
}
		
	}

}
