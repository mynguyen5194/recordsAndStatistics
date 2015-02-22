package student;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Util {
	public Util() {}
	
	protected int countLine(String fileName) throws IOException {
		FileReader file = new FileReader(fileName);
		BufferedReader buffer = new BufferedReader(file);
		int numberOfLine = 0;
		
		while(buffer.readLine() != null)
			numberOfLine++;
		
		buffer.close();
		
		return numberOfLine;
	}
	
	public Student [] readFile(String fileName, Student [] student) {	// student also has 40
		try {
			FileReader file = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(file);
			
			boolean eof = false;
			
			while(!eof) {
				String line = buffer.readLine();					// Read each line
				if(line == null) {
					eof = true;
				}
				else {	// Keep reading (have one line already)
					StringTokenizer tokenizer = new StringTokenizer(line);
					int [] scoreArr = new int[4]; 	// create an scoreArr array to store 4 scores
					
					@attendtion 
					for (int j = 0; j < student.length; j++) { 				
						for (int i = 0; i < scoreArr.length; i++) {
							while(tokenizer.hasMoreTokens()) {
								String newLine = tokenizer.nextToken();
							 
								if(newLine.length() == 4) {
									int studentID = Integer.parseInt(newLine);
									student[j].setSID(studentID);	// save the studentID to student[i];
								}
								else {
									int scores = Integer.parseInt(newLine);
									scoreArr[i] = scores;	// put each scores into one scoreArr
								}
							}
						}	// done for one line -- move to the next line
						student[j].setScores(scoreArr);	// save scoreArr to the student[i].setScores(scoreArr)
					} 
				}
					
			}
			buffer.close();
		
		}
		catch (IOException e) {
			System.out.printf("Error -- " + e.toString());
		}
		return student;
	}
	
	public void displayGrades(String fileName) {
		try {
			FileReader file = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(file);
			
			System.out.printf(" SID\t\t  Scores");
			
			boolean eof = false;
			while (!eof) {
				String line = buffer.readLine();
				
				if(line == null) {
					eof = true;
				}
				else {
					StringTokenizer tokenizer = new StringTokenizer(line);
					while(tokenizer.hasMoreTokens()) {
						String newLine = tokenizer.nextToken();
						
						if(newLine.length() == 4) {
							System.out.printf("\n " + newLine + "\t");
						}
						else {
							int x = Integer.parseInt(newLine);
							System.out.printf("%5d", x);
						}
					}
					
				}
			
			}
			buffer.close();
		}
		catch (IOException e) {
			System.out.printf("Error -- " + e.toString());
		}
	}
}
