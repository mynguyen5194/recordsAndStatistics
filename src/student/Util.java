package student;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Util {
	public Util() {}
	
	public  Student [] readFile(String fileName, Student [] student) {
		try {
			FileReader file = new FileReader(fileName);
			BufferedReader buffer = new BufferedReader(file);
			
			boolean eof = false;
			while(!eof) {
				String line = buffer.readLine();
				if(line == null) {
					eof = true;
				}
				else {	// Keep reading
					int scoreArr[] = new int[5];	// Create a new scoreArr to store 5 scores
					Arrays.fill(scoreArr, -1);
					
					StringTokenizer tokenizer = new StringTokenizer(line);
					while(tokenizer.hasMoreTokens()) {
						String token = tokenizer.nextToken();	// A new String token
						
						for(int i = 0; i < student.length; i++) {
							// Save the SID
							if(token.length() == 4) {
								int studentID = Integer.parseInt(token);
								student[i].setSID(studentID);
							}
						
							// Save the scores to a scoreArr array
							else {
								int scores = Integer.parseInt(token);
								if(scoreArr[i] != -1) {
									scoreArr[i] = scores;
								}
								else {
									
								}
							}		
						}
						 
//							student[i].setScores(scoreArr);	// Save the scoreArr array to the score field
					}
					
				}
			}
			
			buffer.close();
		}
		catch (IOException e) {
			System.out.printf("Error -- " + e.toString());
		}
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
