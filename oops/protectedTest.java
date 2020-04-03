package oops;
import Siva.protected1;
public class protectedTest extends protected1 {
 public static void main(String...sa)
 {
	 protected1 p1  =new protected1();
	// p1.m1();
	 protectedTest p2= new protectedTest();
	 p2.m1();
	 
	 protected1 p3= new  protectedTest();
	 //p3.m1();
 }
	
}
