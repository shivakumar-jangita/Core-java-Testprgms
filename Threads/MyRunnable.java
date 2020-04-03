package Threads;



public class MyRunnable implements Runnable {

	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child Thread is running");
		}
	}
}

class RunnableDemo
{
	public static void main(String ...s)
	{
		MyRunnable m1 = new MyRunnable();
		
		Thread t1=new Thread(m1);
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main Thread is running");
		}
	}
}
