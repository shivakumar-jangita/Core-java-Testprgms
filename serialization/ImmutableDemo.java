package serialization;

 final class ImmutableDemo {

private final String  name; 
 person panNo;
public ImmutableDemo(String n,person p)
	{
		this.name=n;
		this.panNo=new person(p.getPanNo());
		
	}
public String toString()
{
	return name+":"+panNo;
}
	
	public String getName()
	{
		return name;
	}
	
	public person getPanNo()
	{
		return new person(panNo.getPanNo());
	}
	
	
	
	private static void modification(String n,person p)
	{
		n="siva";
		p=new person("CESPS5050P");
	}
	
	
	
	
	public static void main(String...f)
	{
		ImmutableDemo i= new ImmutableDemo("Jangita",new person("CESPS5050Q"));
	
		System.out.println(i.hashCode()+":::"+i);
		modification(i.getName(),i.getPanNo());
		
		System.out.println(i.hashCode()+":::"+i);
		
	}
}

 class person
 {
	 private  String panNo;
	 person(String p)
	 {
		 this.panNo=p;
	 }
	 public String getPanNo()
	 {
		 return panNo;
	 }
	 public String toString()
	 {
		return "PanNo :"+panNo;
		 
	 }
	 
 }
