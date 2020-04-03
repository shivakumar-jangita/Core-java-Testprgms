package designPatterens;

public class Pc extends Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	public Pc(String ram,String hdd,String cpu)
	{
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}

	@Override
	public String getRAM() {
		// TODO Auto-generated method stub
		return this.ram;
	}

	@Override
	public String getHDD() {
		// TODO Auto-generated method stub
		return this.hdd;
	}

	@Override
	public String getCPU() {
		// TODO Auto-generated method stub
		return this.cpu;
	}
}

