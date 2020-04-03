package ivr;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,4,5,6,2,4,7,3};
for(int i=0;i<arr.length-1;i++)
{
	for(int j=i+1;j<arr.length;j++)
	{
		if(arr[i]==arr[j] && (i!=j))
		{
			System.out.println("duplicate  values from Array:"+arr[j]);
		}
	}
}
	}

}
