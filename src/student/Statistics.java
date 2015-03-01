/*
 * Statistics class finds the high scores and low scores and calculates
 * the score average for each quiz. It then prints out the result.
 */

package student;

public class Statistics {
	int [] highScores = new int [5];
	int [] lowScores = new int [5];
	float [] avgScores = new float [5];
	
	public Statistics() {}
	
	protected void findHigh(Student [] student, int size) {
		for(int i = 0; i < 5; i++) {	// for 5 columns
			int highest = student[i].getScores()[0];
			
			for(int j = 0; j < size; j++) {		// for size rows
				if(student[j].getScores()[i] > highest) {	// compare the current data with the highest
					highest = student[j].getScores()[i];
				}
			}
			highScores[i] = highest;	// save the highest into the highScores array
		}
	}
	
	protected void findLow (Student [] student, int size) {
		for(int i = 0; i < 5; i++) {	// for 5 columns 
			int lowest = student[i].getScores()[0];
			
			for(int j = 0; j < size; j++) {	// for size rows
				if(student[j].getScores()[i] < lowest) {	// compare the current data with the lowest
					lowest = student[j].getScores()[i];
				}
			}
			lowScores[i] = lowest;	// save the lowest into the lowScores array
		}
	}
	
	protected void findAvg(Student [] student, int size) {
		for(int i = 0; i < 5; i++) {
			double total = 0;
			
			for(int j = 0; j < size; j++) {
				total += student[j].getScores()[i];		// add up all the value in one column to find total
			}
			float average = (float) (total/size);	// find the average and convert it to float
			avgScores[i] = average;		// save the average into the avgScores array
		}
	}
	
	// Print 5 highest scores
	public void printHighScores(Student [] student, int size) {
		this.findHigh(student, size);
		
		System.out.printf("\nHigh Scores:    ");
		for(int i = 0; i < highScores.length; i++) {
			System.out.printf("%8d", highScores[i]);
		}
	}
	
	// Print 5 lowest scores
	public void printLowScores(Student [] student, int size) {
		this.findLow(student, size);
		
		System.out.printf("\nLow Scores:   ");
		for(int i = 0; i < lowScores.length; i++) {
			System.out.printf("%8d",lowScores[i]);
		}
	}
	
	// Print 5 average scores
	public void printAvgScores(Student [] student, int size) {
		this.findAvg(student, size);
		
		System.out.printf("\nAverage:\t");
		for(int i = 0; i < avgScores.length; i++) {
			System.out.printf("  %5.1f  ", avgScores[i]);
		}
	}
}
