package ivr;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myRunnable[] jobs= {new myRunnable("siva"),new myRunnable("jangita"),
				new myRunnable("jithesh")};
		ExecutorService service=Executors.newFixedThreadPool(10);
		for(myRunnable m:jobs)
		{
			service.submit(m);
		}
		service.shutdown();
	}

}

class myRunnable implements Runnable
{
	String name;
	myRunnable(String name)
	{
		this.name=name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+Thread.currentThread().getName()+"is started");
		try
		{
			
			Thread.sleep(2000);
			
		}
		catch(Exception e)
		{
			
		}
		System.out.println(name+Thread.currentThread().getName()+"Is completed!");
	}
	
}