package classRecords;
import student.*;

public abstract class BridgeClassRecords implements ClassRecords{	
	Student [] student = new Student[15];
	
	public void ReadFile(String fileName) {
		for(int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		
		Util myUtil = new Util();
		student = myUtil.readFile(fileName, student, false);
		
	}
	
	public void ComputeStats() {
		Statistics stat = new Statistics();
		
		stat.printHighScores(student);
		stat.printLowScores(student);
		stat.printAvgScores(student);
	}
	
	public void PrintGrades(String fileName) {
		Util util = new Util();
		util.readFile(fileName, student, true);
	}
}
