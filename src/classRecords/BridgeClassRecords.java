package classRecords;
import student.*;

public abstract class BridgeClassRecords implements ClassRecords{	
	Student [] student = new Student[15];
	
	public void ReadFile(String fileName) {
		Util myUtil = new Util();
		student = myUtil.readFile(fileName, student);
	}
	
	public void ComputeStats() {
		Statistics stat = new Statistics();
		
		stat.printHighScores();
		stat.printLowScores();
		stat.printAvgScores();
	}
	
	public void PrintGrades() {
		Util util = new Util();
		util.displayGrades("records.txt");
		
	}
}
