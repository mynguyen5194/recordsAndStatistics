/*
 * Util class is mainly used to read and display the data from the file by using
 * exceptional handling technique
 * This class also has a numberOfLine 
 */

package student;
import java.io.*;
import java.util.*;
import exceptionHandler.*;

public class Util {
	private int numberOfLine;	// number of line in the file
	
	public Util() {
		numberOfLine = 0;
	}
	
	public int getNumberOfLine() {
		return numberOfLine;
	}
	
	public Student [] readFile(String fileName, Student student[]) {
		boolean problemFixed = false;
		System.out.printf("Inside main\n");
		ProblemGenerator problem = new ProblemGenerator("filenamethatdoesnotexist.txt");
		
		do {
			try {
				problemFixed = problem.openFile();
				
				FileReader file = new FileReader(fileName);
				BufferedReader buffer = new BufferedReader(file);
				boolean eof = false;
				
				while(!eof) {
					for (int r = 0; r < student.length; r++) {	// for student.length rows			
						
						String line = buffer.readLine();		// Read each line
						if(line == null) {
							eof = true;
						}
						else {	// Keep reading (have one line already)
							numberOfLine++;		// increment the line number
							StringTokenizer tokenizer = new StringTokenizer(line);
							int [] scoreArr = new int[5]; 	// create an scoreArr array to store 5 scores		
							
							while(tokenizer.hasMoreTokens()) {
								for (int c = 0; c < scoreArr.length; c++) {		// basically for 5 columns
									String newLine = tokenizer.nextToken();
								 
									if(newLine.length() == 4) {		// student ID has 4 characters
										int studentID = Integer.parseInt(newLine);
										student[r].setSID(studentID);	// save the studentID to student[i];
										break;
									}
									else {	// the rest are scores
										int scores = Integer.parseInt(newLine);
										scoreArr[c] = scores;	// save each scores into one scoreArr					
									}
								}
							}	// done for one line -- move to the next line
							student[r].setScores(scoreArr);	// save scoreArr (5 scores) to the student[r]
						} 
					}	
				}
				buffer.close();
			}
				
			catch(IOException err) {
					System.out.printf("Error -- " + err.toString());
			}
			catch(Repair e)
			{
					problem.setFileName(e.fixProblemReadFromConsole());
			}
			
		}while(problemFixed == false);

		return student;
	}
	
	public void displayGrades(String fileName) {
 		try {
 			FileReader file = new FileReader(fileName);
 			BufferedReader buffer = new BufferedReader(file);
 			
 			System.out.printf("    SID\t\t\t\t    Scores");
 			
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
 							System.out.printf("\n %7s \t", newLine);
 						}
 						else {
 							int x = Integer.parseInt(newLine);
 							System.out.printf("%8d", x);
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
