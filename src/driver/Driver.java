package driver;

import classRecords.*;

public class Driver extends BridgeClassRecords implements ClassRecords{

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
//		driver.PrintGrades();
		driver.ReadFile("records.txt");

	}

}
