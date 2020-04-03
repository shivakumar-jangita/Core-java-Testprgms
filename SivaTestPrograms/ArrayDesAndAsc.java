package SivaTestPrograms;

import java.util.Arrays;

public class ArrayDesAndAsc {
	
	public static void order(int a [],int n)
	{
		Arrays.sort(a);
		for(int i=0;i<n/2;i++)
		{
			System.out.println(a[i]);
		}
		for(int j=n-1;j>=n/2;j--)
		{
			System.out.println(a[j]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {9,1,3,4,2,8,7,5,6,11};
		int len=arr.length;
		
		order(arr,len);
	}

}
