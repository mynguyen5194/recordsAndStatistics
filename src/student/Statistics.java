package student;

public class Statistics {
	int [] lowScores = new int [5];
	int [] highScores = new int [5];
	float [] avgScores = new float [5];
	
	public Statistics() {}
	
	public void findLow (Student [] student) {
		for(int i = 0; i < 5; i++) {	// for 5 columns 
			int lowest = student[i].getScores()[0];
			
			for(int j = 0; j < student.length; j++) {	// for student.length rows
				if(student[j].getScores()[i] < lowest) {
					lowest = student[j].getScores()[i];
				}
			}
			lowScores[i] = lowest;
		}
	}
	
	public void findHigh(Student [] student) {
		for(int i = 0; i < 5; i++) {	// for 5 columns
			int highest = student[i].getScores()[0];
			
			for(int j = 0; j < student.length; j++) {
				if(student[j].getScores()[i] > highest) {
					highest = student[j].getScores()[i];
				}
			}
			highScores[i] = highest;
		}
	}
	
	public void findAvg(Student [] student) {
		for(int i = 0; i < 5; i++) {
			double total = 0;
			
			for(int j = 0; j < student.length; j++) {
				total += student[j].getScores()[i];
			}
			float average = (float) (total/(student.length));
			avgScores[i] = average;
		}
	}
	
	// Print 5 lowest scores
	public void printLowScores(Student [] student) {
		this.findLow(student);
		System.out.printf("\nLow Scores:   ");
		for(int i = 0; i < lowScores.length; i++) {
			System.out.printf("%8d",lowScores[i]);
		}
	}
	
	// Print 5 highest scores
	public void printHighScores(Student [] student) {
		this.findHigh(student);
		System.out.printf("\nHigh Scores:    ");
		for(int i = 0; i < highScores.length; i++) {
			System.out.printf("%7d", highScores[i]);
		}
	}
	
	// Print 5 average scores
	public void printAvgScores(Student [] student) {
		this.findAvg(student);
		System.out.printf("\nAverage:\t");
		for(int i = 0; i < avgScores.length; i++) {
			System.out.printf("  %4.1f  ", avgScores[i]);
		}
	}
}
