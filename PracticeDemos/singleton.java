package PracticeDemos;

public class singleton {

	private static  singleton Instance=null;
			private singleton() {
		
	}
			public static singleton getsingleton()
			{
				return  Instance;
			}
			
}
