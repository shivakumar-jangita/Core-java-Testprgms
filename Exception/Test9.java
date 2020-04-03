package Exception;

public class Test9 {

	public  int getData()
	{
		try{
			System.out.println("inside try block::::::");
			//int i1=10/0;
			return 10;
			
		}
		catch(Exception e)
		{
			System.out.println("catch block:::");
			return 20;
		}
		finally
		{
			System.out.println("finally block:::");
			return 30;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test9 t1= new Test9();
		//t1.getData(10);
		System.out.println(t1.getData());
		
	}

}
