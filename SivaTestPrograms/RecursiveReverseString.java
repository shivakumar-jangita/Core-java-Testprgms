package SivaTestPrograms;

public class RecursiveReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="siaRam";
		System.out.println("Reverse String is -"+recursiveReverse(s1));

	}

	private static String recursiveReverse(String str) {
		if(str.isEmpty())
			return str;
		return recursiveReverse(str.substring(1))+str.charAt(0);
		
	}
}
