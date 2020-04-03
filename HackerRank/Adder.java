package HackerRank;

import java.util.Scanner;

public class Adder extends Calculator {
	
	public void sum(int a,int b)
{
	System.out.println(a+b);
	
}



public static void main(String ...sd) {
	int x , y;
	Adder a1=new Adder();
	Scanner get = new Scanner(System.in);
	System.out.println("\n Enter the Sum values:");
	x=get.nextInt();
	y=get.nextInt();
	a1.sum(x, y);
}
}
