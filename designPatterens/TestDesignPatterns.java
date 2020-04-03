package designPatterens;

public class TestDesignPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testfactory();
	}
	
	private static void  testfactory()
	{
		Computer pc=ComputerFactory.getComputer(new PCFactory("10GB","500GB","3Ghz"));
		Computer laptop=ComputerFactory.getComputer(new laptopFactory("20GB", "1000GB", "5Ghz"));
		System.out.println("PC Configuration"+pc);
		
		System.out.println("Laptop Configuration"+laptop);
	}

}
