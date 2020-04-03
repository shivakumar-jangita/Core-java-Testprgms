package ivr;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class ConcurentModification extends Thread {
	// static List<Integer> list=new ArrayList<>();
	static CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

	public void run() {
		try {

			Thread.sleep(2000);

		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("Chield Thread is trying to update the list");
		list.add(30);
	}

	public static void main(String[] args) throws InterruptedException {

		ConcurentModification mt = new ConcurentModification();
		mt.start();
		list.add(10);
		list.add(20);
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer i = (Integer) itr.next();
			System.out.println("Itteration vlues from main thread" + i);
			Thread.sleep(2000);

		}
		System.out.println("List values::" + list);

	}

}
