package executorThreads;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

/**
 * ThreadWorker represents the tasks to be done. It consumes work items from
 * Blocking Queue and invokes the run method on each task submitted by producer.
 *
 * @author badal
 *
 */
public class ThreadWorker implements Callable{
	List<String> msisdnList = new ArrayList<>();
	String[] msisdnArray = null;
	List<String> dataList = null;
	String cvsSplitBy = ",";


public ThreadWorker(File file) throws Exception {
		
		super();
		
		this.file = file;
	
	}
	
	File file;

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	@Override
	public  Object call() throws Exception {
		List<String> msisdnList = new ArrayList<>();
		String[] msisdnArray = null;
		List<String> dataList = null;
		String cvsSplitBy = ",";
		try {
			BufferedReader br = new BufferedReader(new FileReader(getFile()));
			String line = null;
			
			
			while ((line = br.readLine()) != null) {
			
				msisdnArray = line.split(cvsSplitBy);
				dataList = Arrays.asList(msisdnArray[1]);
				msisdnList.addAll(dataList);
				
			
			}
			//System.out.println("msisdnList"+msisdnList);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println(msisdnList.size());
		return msisdnList;
	}
	
	
}
