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
			student[i] = new Student();
		}
		
		Util myUtil = new Util();
		student = myUtil.readFile(fileName, student);
		
		this.setSize(myUtil.getNumberOfLine());
		System.out.printf("Number Of Line: " + myUtil.getNumberOfLine() + "\n");
	}
	
	public void ComputeStats() {
		Statistics stat = new Statistics();
		
		if(this.getSize() <= student.length) {
			Student [] newStudent = new Student[this.getSize()];
			
			for(int i = 0; i < newStudent.length; i++) {
				newStudent[i] = new Student();
			}
			
			System.arraycopy(student, 0, newStudent, 0, this.getSize());
			
			stat.printHighScores(newStudent);
			stat.printLowScores(newStudent);
			stat.printAvgScores(newStudent);
		}
		else {
			stat.printHighScores(student);
			stat.printLowScores(student);
			stat.printAvgScores(student);
		}
	}
	
	public void PrintGrades(String fileName) {
		Util util = new Util();
		util.displayGrades(fileName);
	}
}
