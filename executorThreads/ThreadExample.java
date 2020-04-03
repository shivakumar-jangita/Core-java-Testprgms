package executorThreads;


import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
	 
	public class ThreadExample {
	 public static List<String> getData(int id) throws Exception	
	 {
		 BlockingQueue workQueue = new LinkedBlockingQueue();
			
			// Create a thread pool executor with core size and maximum size as 2,
			 // specify a time out and pass the blocking queue
			 ThreadPoolExecutor executor = new ThreadPoolExecutor(60, 60, Long.MAX_VALUE, TimeUnit.SECONDS, workQueue);
			 
			 //split files
			 CSVSplit splitObj = new CSVSplit();
			 int fileCount = splitObj.splitFile();
			 System.out.println("fileCount:::::::::"+fileCount);
			 //get split count
			 List<String> finalList = new ArrayList<String>();
			 for(int i = 1; i <= fileCount ; i++){
				 ThreadWorker worker = new ThreadWorker(new File("C:/CC-Code/Filesplit/test"+i+".txt"));
				 List<String> objTest = (List<String>) worker.call();
				 System.out.println("Time"+System.currentTimeMillis());
				 finalList.addAll(objTest);
			 }
			 System.out.println("finalList size::::::"+finalList.size());
			/*ThreadWorker worker1 = new ThreadWorker(new File("C:/opt/ConsistencyChecker/var/reports/extract/MetroPc_Result1.txt"));
			 ThreadWorker worker2 = new ThreadWorker(new File("C:/opt/ConsistencyChecker/var/reports/extract/MetroPc_Result2.txt"));
			
			 List<String> objTest1 = (List<String>) worker1.call();
			 List<String> objTest2 = (List<String>) worker2.call();
			 System.out.println("objTest1:::::::::"+objTest1);
			 System.out.println("objTest2:::::::::"+objTest2);
			 //List<String> finalList = new ArrayList<String>();
			 finalList.addAll(objTest1);
			 finalList.addAll(objTest2);*/
			// Submit runnable to thread pool executor
			 //executor.submit(worker1);
		     //executor.submit(worker2);
			
			// Gracefully shutdown thread pool executor. All submitted tasks will
			 // run to completion, no new tasks will be accepted.
			 executor.shutdown();
			 
			// Wait for all submitted tasks to complete. Handle InterruptedException
			 // if thread pool executor is interrupted.
			 try {
			 executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
			 } catch (InterruptedException e) {
			 System.out.println("ThreadPoolExecutor was interrupted. Do appropriate handling.");
			 e.printStackTrace();
			 }
			 System.out.println("finalList size::::::"+finalList);
			return finalList;
			 
			}
	 
	public static void main(String[] args) throws Exception {
	 // Create a blocking queue to hold work items (runnables). Decouples
	 // producers and consumers.
		getData(1);
	}
	 
	}

