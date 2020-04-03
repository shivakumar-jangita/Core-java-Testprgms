package PracticeDemos;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class myrunnable implements Runnable
{
	String name;
	
	myrunnable(String name)
	{
		this.name=name;
	}
	@Override
	public void run() {
		System.out.println(name+Thread.currentThread().getName()+"is started");
		try
		{
		Thread.sleep(100);
		// TODO Auto-generated method stub
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(name+Thread.currentThread().getName()+" completed");
	}
	
}

 class Threadpool1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myrunnable[] jobs= {new myrunnable("siva"),
				new myrunnable("jangita"),
				new myrunnable("jithesh"),
				new myrunnable("yashika"),
				new myrunnable("gangita"),
				new myrunnable("githesh"),
				new myrunnable("eashika"),
				new myrunnable("fangita"),
				new myrunnable("aithesh"),
				new myrunnable("rashika")
		};
		
		
		ExecutorService service= Executors.newFixedThreadPool(3);
		for(myrunnable dd:jobs) {
		service.submit(dd);
		}
		service.shutdown();
		
		
		

	}

}
