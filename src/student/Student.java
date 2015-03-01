/*
 * Student class includes student ID number and an array
 * of 5 elements for each score
 */

package student;

public class Student {
	private int SID;
	private int scores[] = new int [5];
	
	public Student() {}
	public Student(int ID, int[] Scores) {
		SID = ID;
		scores = Scores;
	}
	
	public int getSID() {
		return SID;
	}
	public void setSID(int sID) {
		SID = sID;
	}
	public int[] getScores() {
		return scores;
	}
	public void setScores(int[] scores) {
		this.scores = scores;
	}
	
	public void printSID() {
		System.out.printf("SID: " + this.getSID());
	}
	
	public void printScores() {
		StringBuffer string = new StringBuffer("");
		for(int i = 0; i < this.scores.length; i ++) {
			string.append("  " + scores[i] + "  ");
			System.out.println(string);
		}
	}
}
