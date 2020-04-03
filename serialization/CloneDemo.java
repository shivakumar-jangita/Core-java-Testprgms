package serialization;

public class CloneDemo implements Cloneable {

	int i=10;int j=20;
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneDemo c=new CloneDemo();
		CloneDemo c1=(CloneDemo)c.clone();
		c1.i=888;
		System.out.println(c.i+"...."+c.j);
		System.out.println(c1.i+"...."+c1.j);
	}

}
