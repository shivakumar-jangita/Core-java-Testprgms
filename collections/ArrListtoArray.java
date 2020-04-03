package collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrListtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Integer> al=new ArrayList<>();
		
al.add(10);
al.add(4);
al.add(7);
al.add(22);

Integer[] arr=al.toArray(new Integer[al.size()]);
System.out.println(Arrays.toString(arr));
//System.out.println(arr[0]);

for (Integer in:al)
{
	System.out.println(in);
	
	
}
		
	}

}
