package java8;

 interface interf1 {
	public void add(int a,int b);

}
 class Test1
{
	public static void main(String...sa)
	{
		interf1  i=(a,b)->System.out.println("the sum is:"+(a+b));
		i.add(10, 20);
	}
}
