package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myRunnable1 implements Runnable
{

	String name;
	myRunnable1(String name)
	{ this.name=name;
		
	}
	@Override
	public void run() {
	System.out.println(name+"job started by thread name"+Thread.currentThread().getName());
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			
		}
		System.out.println(name+"job completed by thread name"+Thread.currentThread().getName());
	}
	
}
class ExecutorDemo
{
	public static void main(String...s)
	{
		myRunnable1[] jobs={new myRunnable1("siva"),
				new myRunnable1("kumar"),
				new myRunnable1("jith"),
				new myRunnable1("radha")};
		ExecutorService es= Executors.newFixedThreadPool(4);
		for(myRunnable1 ss:jobs)
		{
			es.submit(ss);
		}
		es.shutdown();
		} 
	}
