package ivr;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class DeadLockExm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String s1="Siva";
		final String s2="Kumar";
		Thread t1= new Thread()
				{
			public void run()
			{
				synchronized (s1) {
					System.out.println("Thread1:resource 2 locked");
					try
				{
					Thread.sleep(1000);
				}
				catch (Exception e) {
					// TODO: handle exception
				}
					synchronized (s2) {
						System.out.println("thread1:resource 2 locked");
					}
						
					}
			}
				};
Thread t2= new Thread()
{
	public void run()
	{
		synchronized (s2) {
		System.out.println("Thread2:resource 2 locked");
		try
		{
			Thread.sleep(2000);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		synchronized (s1) {
			System.out.println("Thread2:resource1 locked");
		}
			
		}
	}
};
t1.start();
t2.start();
	}

}
