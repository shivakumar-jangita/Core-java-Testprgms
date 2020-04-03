package ivr;


//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");

class Solution {
	public static int solution(int A, int B){

		int result = 0;

		int count = 0;

		for(int i=1;i<=B;i++){

		result = i*(i+1);

		if(result >= A && result <= B){

		count++;

		}

		}

		return count;

		}

		
 public static void main(String...sdd){
	
		
		System.out.println("Range  is=" +solution(21,29));
}
}