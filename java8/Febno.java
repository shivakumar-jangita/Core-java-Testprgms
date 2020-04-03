package java8;

import java.util.function.Supplier;

public class Febno implements Supplier<Long> {

private long current=1;
private long previous=0;

			
			@Override
	public Long  get() {
		// TODO Auto-generated method stub
				
long next=current+previous;
previous=current;
current=next;
				
return (previous);
	}
			
	public static void main(String...ds)
	{
		
		Febno fb= new Febno();
		int length=10;
		for (int k = 0; k < length-2; k++) {
		fb.get();
		System.out.println("result:"+fb.get());
	}
	}
}
