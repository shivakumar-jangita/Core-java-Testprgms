package ivr;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Madam";
		String check="";
		for(int i=str.length()-1;i>=0;i--)
		{
			check+=str.charAt(i);
		}
			if(check.equalsIgnoreCase(str))
			{
				System.out.println(str+"->   is palandrome");
			}
			else
			{
				System.out.println(str+" ->  is not palandrome");
			}
		}
	

}
