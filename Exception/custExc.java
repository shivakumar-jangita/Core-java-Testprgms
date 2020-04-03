package Exception;

public class custExc
{
	public static void main(String[] args){
		
		int age =Integer.parseInt(args[0]);
				if(age>60){
					throw new Test10("hey dude wait for some time you  will get good match!");
					
				}
				else if(age<18)
				{
					throw new Test11("hey young man good luck!");
				}
				else
				{
					System.out.println("ThanQ you for registering the details in the portal!!!will be get back to you.");
				}
		
	}
}
