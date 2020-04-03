package executorThreads;


	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;

	public class Split {

	    private final static String NEWLINE = System.getProperty("line.separator");

	    public static void readFileData(String filename, int lines) throws IOException {
	 try {
		 System.out.println("inside readFileData start:");
	    BufferedReader bufferedReader = new BufferedReader(new FileReader(
	     filename));
	    StringBuffer stringBuffer = new StringBuffer();

	    String line;
	    int i = 0;
	    int counter = 1;
	    while ((line = bufferedReader.readLine()) != null) {
	  stringBuffer.append(line);
	  stringBuffer.append(NEWLINE);
	  i++;
	  if (i >= lines) {
		  createFile(stringBuffer, filename + counter);
	     stringBuffer = new StringBuffer();
	     i = 0;
	     counter++;
	  }
	    }
	    bufferedReader.close();
	 } catch (IOException e) {
	    throw new IOException("read file error " + filename);
	 }
	    }

	    private static void createFile(StringBuffer stringBuffer, String filename) {
	    	System.out.println("Inside Create file:start");
	 String path = (new File("")).getAbsolutePath();
	 File file = new File("C:/CC-Code/Filesplit" + "/" + "test.txt");
	 FileWriter output = null;
	 try {
	    output = new FileWriter(file);
	    output.write(stringBuffer.toString());
	    System.out.println("file " + path + filename + " written");
	 } catch (IOException e) {
	    e.printStackTrace();
	 } finally {

	    try {
	  output.close();
	    } catch (IOException e) {
	    }
	 }
	    }

	    public static void main(String[] args) {

	 String fileName = "C:/CC-Code/Filesplit/ravi.txt";
	 int lines = 100;

	 try {
	     readFileData(fileName, lines);
	 } catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	 }
	    }
}
