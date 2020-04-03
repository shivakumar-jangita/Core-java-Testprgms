package PracticeDemos;

public class DeadLockDemo {
	public static void main(String[] sds) {
		final String s1 = "Spring";
		final String s2 = "Hibernate";
		Thread t1 = new Thread() {
			public void run() {
				synchronized (s1) {
					System.out.println("Thread1 : resource 1 locked");
					try {
						Thread.sleep(100);

					} catch (Exception e) {
						// TODO: handle exception

					}

					synchronized (s2) {
						System.out.println("thread1 : resource 2 locked");

					}
				}
			}

		};
		Thread t2 = new Thread() {
			public void run() {
				synchronized (s2) {
					System.out.println("Thread2 : resource 2 locked");
					try {
						Thread.sleep(100);

					} catch (Exception e) {
						// TODO: handle exception

					}

					synchronized (s1) {
						System.out.println("Thread2 : resource 2 locked");
					}
				}
			}

		};

		// DeadLockDemo d1= new DeadLockDemo();
		t1.start();
		t2.start();
	}
}
