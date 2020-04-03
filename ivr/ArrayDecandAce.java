package ivr;

import java.util.Arrays;

public class ArrayDecandAce {

	public static void printOrder(int[]arr ,int len)
	{
		Arrays.sort(arr);
		
		for(int i=0;i<len/2;i++)
		{
			System.out.println("Acending order"+arr[i]+" ");
		}
		for(int j=len-1;j>=len/2;j--)
		{
			System.out.println("Dcending order"+arr[j]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] aa= {1,9,8,2,3,4,7,5,6};
		int n=aa.length;
		printOrder(aa,n);
		
	}

}
