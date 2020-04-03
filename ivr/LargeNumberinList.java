package ivr;

import java.util.ArrayList;
import java.util.List;

public class LargeNumberinList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> list= new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		int b=list.get(0);
		int s=list.get(0);
		for(Integer values:list)
		{
			if(values>b)
			{
				b=values;
			}
			else
			{
				s=values;
			}
		}
		System.out.println("biggest value from the list"+b);
		System.out.println("smallest value from the list"+s);		
	}

}
