/**
 * 
 */
package executorThreads;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * @author esivjan
 *
 */
public class CsvReaderUtil {

	

	public static List<String> getInconsistencyMsisdnData(int segmentId) {
		List<String> msisdnList = new ArrayList<>();
		String csvFile = "/opt/ConsistencyChecker/var/reports/extract/MetroPc_Result1.csv";
		String line = "";
		String cvsSplitBy = ",";
		String[] msisdnArray = null;
		List<String> dataList = null;

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
			while ((line = br.readLine()) != null) {
				// use comma as separator
				msisdnArray = line.split(cvsSplitBy);
				dataList = Arrays.asList(msisdnArray[1]);
				msisdnList.addAll(dataList);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		System.out.println("size" + msisdnList.size());

		return msisdnList;
	}
	public static void main(String...sa)
	{
		getInconsistencyMsisdnData(1);
	}

}