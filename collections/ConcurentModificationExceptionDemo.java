package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurentModificationExceptionDemo extends Thread {
	//static ArrayList list= new ArrayList();
	static CopyOnWriteArrayList<String> list= new CopyOnWriteArrayList<>();
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			System.out.println("ERROR-->"+e);
		}
		System.out.println("child thread to update the list values");
		//list.clear();
		list.add("D");
		
		
	}
	public static void main(String...sa) throws InterruptedException
	{
		ConcurentModificationExceptionDemo t1= new ConcurentModificationExceptionDemo();
		t1.start();
		list.add("A");
		list.add("B");
		list.add("C");
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			String s1= (String)itr.next();
			System.out.println("Itteration vlues from main thread"+s1);
			Thread.sleep(3000);
		}
		System.out.println(list);
	}
	


}