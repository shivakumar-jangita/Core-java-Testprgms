package ivr;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		CountDownLatch latch= new CountDownLatch(3);
		Worker w1= new Worker(1000,latch);
		Worker w2= new Worker(2000,latch);
		Worker w3= new Worker(3000,latch);
		w1.start();
		w2.start();
		w3.start();
		latch.await();
		System.out.println(Thread.currentThread().getName()+"has finshed");
	}

}

class Worker extends Thread
{
	int dealy;
	CountDownLatch latch;
	public Worker(int dealy,CountDownLatch latch) {
		this.dealy=dealy;
		this.latch=latch;
		
	}
	@Override
	public void run() {
		try
		{
			Thread.sleep(dealy);
			latch.countDown();
			System.out.println("CountDown"+Thread.currentThread().getName()+"Finished");
		}
		catch(Exception e)
		{
			
		}
		
	}
	
}