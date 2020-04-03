package Exception;

public class Test1 {
static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			System.out.println("inside try"); 
			i=10/0;
			System.out.println("after try"); 
		}
		catch(Exception e)
		
		{
			System.out.println("catch block"); 
			e.printStackTrace();
		}
		finally
		{
//			String s=null;
//			
//			System.out.println("inside finally"+s.length()); 
		}
		
		
		
	}

}
