package data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CSVDataReader extends DataReader {
	String csvFilepath;
	List<Person> persons;

	public static void main(String[] args) {
		CSVDataReader("C:\\persons.csv");
	}

	public static void CSVDataReader(String csvFilepath) {
		BufferedReader br = null;
		String line = "";

		try {

			Map<String, String> personList = new HashMap<String, String>();
			Map<String, String> employeeList = new HashMap<String, String>();

			br = new BufferedReader(new FileReader(csvFilepath));

			while ((line = br.readLine()) != null) {
				List<String> personDetails = Arrays.asList(line.split(","));
				if (!personDetails.get(personDetails.size() - 2).equals("")) {
					employeeList.put(personDetails.get(0), personDetails.get(2));
				} else {
					personList.put(personDetails.get(0), personDetails.get(2));
				}

			}
			System.out.println(personList);
			System.out.println(employeeList);

		} catch (Exception e) {
			e.printStackTrace();

		}
		try {
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
