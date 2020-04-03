package designPatterens;

public class laptopFactory implements ComputerAbstractFactory {
	private String ram;
	private String hdd;
	private String cpu;
	
	public laptopFactory(String ram,String hdd,String cpu)
	{
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
		
	}

	@Override
	public Computer createcomputer() {
		// TODO Auto-generated method stub
		return new laptop(ram, hdd, cpu);
	}
	

}
