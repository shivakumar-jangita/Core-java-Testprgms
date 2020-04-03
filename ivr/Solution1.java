package ivr;

import java.util.*;

class Solution1 {
    public static String[] solution(int N, int K) {
    	
        if (N == 0) {
            return new String[] {" "};
        }
        ArrayList<String> result = new ArrayList<String>();
        for (String p : solution(N - 1, K - 1)) {
            for (char l : new char[] {'a', 'b', 'c'}) {
                int pLen = p.length();
                if (pLen == 0 || p.charAt(pLen - 1) != l) {
                	
                	
                	result.add(p + l);
                	
                    //System.out.println(result.toString());
                }
                
            }
        }
        int prefSize = Math.min(result.size(), K);
       
        result.subList(0, prefSize);
       // System.out.println(result);
        String[] array = result.toArray(new String[prefSize]);
		System.out.println(Arrays.toString(array));
       return array;
    }
    public static void main(String...siva) {
    	
    	solution(5,6);
    	
    }
}
