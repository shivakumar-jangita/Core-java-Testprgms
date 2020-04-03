package HackerRank;

import java.util.Arrays;

public class BinarySearch {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr= {"atest","java","NewYourk","Siva"};
		Arrays.sort(arr);
		for(String aas:arr) {
			//System.out.println(aas);
			System.out.println(Arrays.binarySearch(arr, "NewYourk"));
			
		}
		

	}

}
