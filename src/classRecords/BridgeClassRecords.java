package classRecords;
import student.*;

public abstract class BridgeClassRecords implements ClassRecords{	
	Student [] student = new Student[15];
	
	public void ReadFile(String fileName) {
		for(int i = 0; i < student.length; i++) {
			student[i] = new Student();
		}
		
		Util myUtil = new Util();
		student = myUtil.readFile(fileName, student);
		
		for(int j = 0; j < student.length; j++) {
			System.out.printf("\nSID: " + student[j].getSID() + " -- ");
			for(int k = 0; k < 5; k++) {
				System.out.printf("  " + student[j].getScores()[k] + "  ");
			}
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
