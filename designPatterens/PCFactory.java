package designPatterens;

import org.w3c.dom.views.AbstractView;

public class PCFactory  implements ComputerAbstractFactory{

	private String ram;
	private String hdd;
	private String cpu;
	
	public PCFactory(String ram,String hdd,String cpu)
	{
	this.ram=ram;
	this.hdd=hdd;
	this.cpu=cpu;
	}
	@Override
	public Computer createcomputer() {
		// TODO Auto-generated method stub
		return new Pc(ram,hdd,cpu);
	}

}
