package classRecords;
import student.*;

public abstract class BridgeClassRecords implements ClassRecords{
	Student [] student = new Student[40];
	
	public void ReadFile(String fileName) {
		Util myUtil = new Util();
		myUtil.readFile("records.txt", student);
	}
	
	public void ComputeStats() {
		Statistics stat = new Statistics();
		
		stat.printHighScores();
		stat.printLowScores();
		stat.printAvgScores();
	}
	
	public void PrintGrades() {
		
	}
}
