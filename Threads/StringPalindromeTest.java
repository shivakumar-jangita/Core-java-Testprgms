package Threads;

public class StringPalindromeTest {

	public  void main(String[] args) {
		// TODO Auto-generated method stub
		
			String[] sa = {"tom ", "jerry "};
			for (int x = 0; x < 3; x++) {
			for (String s : sa) {
			System.out.print(x + " " + s);
			if (x == 1) {
			break;
			}
			}
			}
			}
}