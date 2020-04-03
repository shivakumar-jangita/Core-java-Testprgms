package oops;

class pp
{
	public static void m1()
	{
		System.out.println("Parent impl..");
	}
}
class cc extends pp
{
	public static void m1()
	{
		System.out.println("chield impl...");
	}
}
public class OverrideTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pp p1= new cc();

p1.m1();
pp p2= new pp();
p2.m1();
cc c1= new cc();

c1.m1();
	}

}
