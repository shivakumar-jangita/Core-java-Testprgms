package ivr;

public class SharedObject {
	private volatile static int count=0;

	 static void increamentCount(){
	        count++;
	    }
	    public static int  getCount(){
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		increamentCount();
		getCount();
		
	}

}
