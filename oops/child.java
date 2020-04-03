package oops;


 class parent1 {

	public void m1()
	
	{
		System.out.println("parent1 m1 ()");
	}
}

class parent2
{
	public void m1()
	{
		System.out.println("Parent2 m1()");
	}
}

//class child extends parent2,parent1  --->multiple inheritence issue some ambiqitious problem.
class child extends parent2
{
	public static void main(String...sd)
	{
		child c= new child();
		c.m1();
	}
	
}

