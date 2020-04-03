package java8;

interface interf2
{
	public static void m1(){
		System.out.println("static methos block impl!");
	}
	public default void m2()
	{
		System.out.println("Default method impl");
	}
}
public class Test3 implements interf2 {

	/*public  void m2()
	{
		System.out.println("OverRiding  default method impl");
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf2.m1();
		Test3 t= new Test3();
		t.m2();
	}

}
