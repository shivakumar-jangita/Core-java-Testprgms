package java8;

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r =()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Chield Thread calling...");
			}
		};
		Thread t= new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("main Thread calling...");
		}

	}

}
