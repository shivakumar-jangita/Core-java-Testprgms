package ivr;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class GFG {
	public static void main(String...sd){
		
		Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        for(int j=0; j<t; j++){
            String str = sc.nextLine();
            int i;
            char[] str1= str.toCharArray();
            for(i = 0; i<str.length(); i= i+2){
                System.out.print(str1[i]);
            }
            System.out.print(" ");
            for(i=1; i<str.length(); i=i+2){
                System.out.print(str1[i]);
            }
            System.out.println("");
        }
    }

    } 

