package driver;

import classRecords.*;

public class Driver extends BridgeClassRecords implements ClassRecords{

	public static void main(String[] args) {
		
		Driver driver = new Driver();
		
		driver.ReadFile("records.txt");
		driver.PrintGrades("records.txt");
		driver.ComputeStats();
		
	}

}
