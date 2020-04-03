package collections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo  extends Thread{
	static ConcurrentHashMap<Integer, String> cmap= new ConcurrentHashMap<>();
	public void run() {
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("Child Thread is updating the map");
		cmap.put(101, "D");
	}

	public static void main(String...df) throws InterruptedException
	{
		ConcurrentHashMapDemo c= new ConcurrentHashMapDemo();
		c.start();
		cmap.put(100, "A");
		cmap.put(102, "B");
		cmap.put(103, "C");
		
		for(Map.Entry<Integer, String> map:cmap.entrySet()) {
			System.out.println("Main Thread fectching key"+map.getKey()+"val"+map.getValue());
		Thread.sleep(30000);
		
		}
		System.out.println("Map values is ="+cmap);
	}
}
