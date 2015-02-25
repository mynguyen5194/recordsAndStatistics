package classRecords;
import student.*;

public abstract class BridgeClassRecords implements ClassRecords{	
	Student [] student = new Student[15];
	
	public void ReadFile(String fileName) {
		for(int i = 0; i < student.length; i++) {
			student[i] = new Student();
		
		Util myUtil = new Util();
		student[i] = myUtil.readFile(fileName, student[i]);
		
		System.out.printf("SID: " + student[i].getSID() + "-- \n");
		}
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
