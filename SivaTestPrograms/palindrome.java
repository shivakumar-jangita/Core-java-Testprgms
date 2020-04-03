package SivaTestPrograms;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=214;int rev=0;
while(num!=0)
{
	rev=rev*10;
	rev=rev+num%10;
	num=num/10;
	
}
System.out.println(rev);
	}

}
