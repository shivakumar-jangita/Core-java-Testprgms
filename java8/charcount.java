package java8;

public class charcount {
	public static long count(String str,char c)
	{
		return str.chars().filter(ch->ch==c).count();
		
	}
public static void main(String...as)
{
	String str="karnataka";
	char c='k';
	System.out.println(count(str,c));
}
}
