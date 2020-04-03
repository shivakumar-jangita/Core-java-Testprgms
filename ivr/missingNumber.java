package ivr;

public class missingNumber {
	public static void main(String... sd) {

		int arr1[] = { 7, 5, 6, 1, 4, 2};
		//System.out.println(arr1.length);
		System.out.println("Missing Num is=" + missingNumber(arr1));
	}

	public static int missingNumber(int arr[]) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int resultSum = 0;
		for (int i = 0; i < arr.length; i++) {
			resultSum += arr[i];
		}
		int missingNum = sum - resultSum;

		return missingNum;

	}

}
