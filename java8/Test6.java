package java8;
interface inter3
{
	public void m1();
}
public class Test6 {

	public  void m2()
	{
		System.out.println("m2  method reference impl..");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test6 t= new Test6();
inter3 i=t::m2;
i.m1();
	}

}
