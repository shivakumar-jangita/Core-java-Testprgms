package PracticeDemos;

import java.io.BufferedReader;
import java.io.FileReader;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BufferedReader reder;
		try {
		reder=new BufferedReader(new FileReader("C://3pp-softwares/aaa.bin"));
		
		String line =reder.readLine();
		
		while(line!=null)
		{
			String [] sarr=line.split(",");
			for(String ss:sarr)
			System.out.println(ss);
			line=reder.readLine();
		}
		
		reder.close();
	}
		
		catch (Exception e) {
			// TODO: handle exception
		}
	}
}
