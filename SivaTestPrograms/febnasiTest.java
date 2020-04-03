package SivaTestPrograms;

public class febnasiTest {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=1,k=0;
		int leg=10;
		System.out.println(i+" "+j);
		for(int m=0;m<leg-2;m++)
		{
			k=i+j;
			System.out.println(k);
			i=j;
			j=k;
			
		}
	}

}
