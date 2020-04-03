package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationDemo implements Serializable {

	
	public static void main(String...w) throws Exception
	{
		Student s=new Student(100,"kumar");
		FileOutputStream fos=new FileOutputStream("C:\\3pp-softwares\\Test.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(s);
		
		oos.flush();
		System.out.println("serialization success");
		FileInputStream fis = new FileInputStream("C:\\3pp-softwares\\Test.txt");
		ObjectInputStream ois=  new ObjectInputStream(fis);
		Student s1=(Student)ois.readObject();
		System.out.println(s1.id+"deserialization="+s1.name);
		ois.close();
	}
}
