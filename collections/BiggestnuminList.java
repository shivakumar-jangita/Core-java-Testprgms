package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BiggestnuminList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer>  ll= new ArrayList<Integer>();
		ll.add(17);
		ll.add(11);
		ll.add(179);
		ll.add(1);
		System.out.println(ll);
		
		int smallest = (int) ll.get(0);
		int large = (int) ll.get(0);
		int second_large=(int)ll.get(0);
		
		for(Integer val : ll){
			//	11		17
			if(val > large){
				large = val;
			}
			else if(large<val)
			{
				second_large=val;
				
			}
			else
			{
				smallest=val;
			}
		}
		
		System.out.println("large::::::"+large);
		
		System.out.println("smallest::::::"+smallest);
		System.out.println("secondlarge::::"+second_large);
	}

}
