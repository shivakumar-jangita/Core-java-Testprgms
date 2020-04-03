package PracticeDemos;

import java.util.concurrent.CountDownLatch;

public class countdownlatch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
CountDownLatch latch= new CountDownLatch(3);
worker w1= new worker(1000,latch);
worker w2= new worker(2000,latch);
worker w3= new worker(3000,latch);
w1.start();
w2.start();
w3.start();
latch.await();
System.out.println(Thread.currentThread().getName()+"has finished!");
	}

}

class worker extends Thread
{
	private int dealy;
	private CountDownLatch latch;
	 
	 worker(int dealy,CountDownLatch latch)
	 {
		 this.dealy=dealy;
		 this.latch=latch;
	 }
	public void run()
	{
		try
		{
			Thread.sleep(dealy);
			latch.countDown();
			System.out.println(Thread.currentThread().getName()+"finished");
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}