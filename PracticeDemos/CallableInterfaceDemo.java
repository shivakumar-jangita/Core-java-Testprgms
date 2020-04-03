package PracticeDemos;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableInterfaceDemo  implements Callable<String>{

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return Thread.currentThread().getName();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ExecutorService service=Executors.newFixedThreadPool(10);
		List<Future<String>> al= new ArrayList<Future<String>>();
		CallableInterfaceDemo cd= new CallableInterfaceDemo();
		for(int i=0;i<100;i++)
		{
			Future<String> future=service.submit(cd);
			al.add(future);
		}
				
		
		for(Future<String>ff:al)
		{
			try
			{
				System.out.println(new Date()+":::"+ff.get());
			}
			catch (InterruptedException | ExecutionException e) {
				// TODO: handle exception
			}
			
		}
		System.out.println("Shutdown the Threads!");
		service.shutdown();
	}

	

}
