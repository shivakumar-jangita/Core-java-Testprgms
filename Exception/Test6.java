package Exception;

public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread t1= new Thread();
		System.out.println(t1.currentThread());
		t1.start();
		System.out.println("After Starting the threaad::;"+t1.hashCode());
		t1.start();
	}

}
