/*
 * BridgeClassRecords class contains an int size and a student array
 * which is initialized to 40.
 * This class implements the ReadFile, ComputeStats, and PrintGrades
 * for the ClassRecords class
 */

package classRecords;
import student.*;

public abstract class BridgeClassRecords implements ClassRecords{
	private int size;
	Student [] student = new Student[40];
	
	public void setSize(int Size) {
		size = Size;
	}
	
	public int getSize() {
		return size;
	}
	
	public void ReadFile(String fileName) {
		for(int i = 0; i < student.length; i++) {
			student[i] = new Student();	// create new student
		}
		
		Util myUtil = new Util();
		student = myUtil.readFile(fileName, student);	// save the return value from readFile to student array
		
		this.setSize(myUtil.getNumberOfLine());	// get the number of line after reading the file
	}
	
	public void ComputeStats() {
		Statistics stat = new Statistics();
		
		// compute the statistics if the file contains 40 lines or less (<= 40 students)
		if(this.getSize() <= student.length) {	
			stat.printHighScores(student, this.getSize());
			stat.printLowScores(student, this.getSize());
			stat.printAvgScores(student, this.getSize());
			
		}
		else {	// Otherwise, compute the statistics for 40 students and eliminate the rest
			stat.printHighScores(student, student.length);
			stat.printLowScores(student, student.length);
			stat.printAvgScores(student, student.length);
		}
	}
	
	public void PrintGrades(String fileName) {
		Util util = new Util();
		util.displayGrades(fileName);
	}
}
