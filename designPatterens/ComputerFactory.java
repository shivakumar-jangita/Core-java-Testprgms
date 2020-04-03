package designPatterens;

public class ComputerFactory {

	public static Computer getComputer(ComputerAbstractFactory factory)
	{
		return factory.createcomputer();
	}
}
