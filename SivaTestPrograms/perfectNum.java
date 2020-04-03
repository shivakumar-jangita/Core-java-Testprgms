package SivaTestPrograms;

public class perfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int num=6;
		for(int j=1;j<num;j++)
		{
			if(num%j==0)
			{
				sum=sum+j;
				//
			}
			System.out.println("sum="+sum);
		}
		
		if(sum==num)
		{
			System.out.println("perfect number"+num);
		}
		else
		{
			System.out.println("not perfect"+num);
		}

	}

}
