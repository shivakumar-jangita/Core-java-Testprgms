package Threads;

 class SyncronizationDemo {

	public  synchronized void wish(String name)
	{
		for(int i=0;i<4;i++)
		{
			System.out.print("GoodMorning:::");
	//		System.out.print("GoodAfterNoon:::");
			
				try
				
				{
					Thread.sleep(2000);
			}
				catch(InterruptedException ie)
				{
					
				}
		System.out.println(name);
	}
	}
}
class SynDemo extends Thread
{
	SyncronizationDemo s;
	String name;
	public SynDemo(SyncronizationDemo s,String name) {
		this.s=s;
		this.name=name;
		
	}
	public void run()
	{
		s.wish(name);
	}
	public static void main(String...ds) throws Exception{
		SyncronizationDemo s1 =new SyncronizationDemo();
		//SyncronizationDemo s2 =new SyncronizationDemo();
		SynDemo t1= new SynDemo(s1,"kumar");
		SynDemo t2= new SynDemo(s1,"siva");
	t1.start();
	t2.start();
	t1.join();
	t2.join();
	}

}