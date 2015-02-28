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
				if(student[i].getScores()[j] < lowest) {
					lowest = student[i].getScores()[j];
				}
			}
			lowScores[i] = lowest;
		}
	}
	
	public void findHigh(Student [] student) {
		for(int i = 0; i < 5; i++) {	// for 5 columns
			int highest = student[i].getScores()[0];
			
			for(int j = 0; j < student.length; j++) {
				if(student[i].getScores()[j] > highest) {
					highest = student[i].getScores()[j];
				}
			}
			highScores[i] = highest;
		}
	}
	
	public void findAvg(Student [] student) {
		for(int i = 0; i < 5; i++) {
			float avg = (this.highScores[i] + this.lowScores[i])/2;
			avgScores[i] = avg;
		}
	}
	
	// Print 5 lowest scores
	public void printLowScores(Student [] student) {
//		this.findLow(student);
		System.out.printf("\nLow Scores: ");
		for(int i = 0; i < lowScores.length; i++) {
			System.out.printf("  " + lowScores[i] + "  ");
		}
	}
	
	// Print 5 highest scores
	public void printHighScores() {
		System.out.printf("\nHigh Scores: ");
		for(int i = 0; i < highScores.length; i++) {
			System.out.printf("  " + highScores[i] + "  ");
		}
	}
	
	// Print 5 average scores
	public void printAvgScores() {
		System.out.printf("\nAverage: ");
		for(int i = 0; i < avgScores.length; i++) {
			System.out.printf("  " + avgScores[i] + "  ");
		}
	}
}
