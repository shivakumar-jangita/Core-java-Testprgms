package PracticeDemos;

import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReenterntLockDemo {

	public static void main (String [] ads)
	{
		printQueue pq= new printQueue();
		Thread [] arr=new Thread[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=new Thread(new printjob(pq)," thread "+i);
		}
		for(int j=0;j<10;j++)
		{
			arr[j].start();
		}
		
	}
}

class printjob implements Runnable
{
	private printQueue pqueue;
	 
	printjob(printQueue pqueue)
	{
		this.pqueue=pqueue;
	}
	
	public void run()
	{
		try
		{
			
			System.out.println("Going to print the documrent! "+Thread.currentThread().getName());
			
			pqueue.jobProcess( new Object());
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}

class printQueue
{
	private final Lock queuelock=new ReentrantLock();
	public void jobProcess(Object document)
	{
		System.out.println("inside the jobprocess methoed is send the document as input from this method");
		queuelock.lock();
		try
		{
			long duriation= (long) (Math.random()*1000);
			System.out.println(Thread.currentThread().getName()+"job process  the duriation printing document-"+(duriation/1000)+"seconds in time- "+new Date());
			Thread.sleep(duriation);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
finally
{
	System.out.println(Thread.currentThread().getName()+"print queue process is completed");
	queuelock.unlock();
}
		
	}
}