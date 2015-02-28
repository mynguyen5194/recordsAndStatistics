package student;
import java.io.*;
import java.util.*;
import exceptionHandler.*;

public class Util {
	public Util() {}
	
//	protected int countLine(String fileName) throws IOException {
//		FileReader file = new FileReader(fileName);
//		BufferedReader buffer = new BufferedReader(file);
//		int numberOfLine = 0;
//		
//		while(buffer.readLine() != null)
//			numberOfLine++;
//		
//		buffer.close();
//		
//		return numberOfLine;
//	}
	
	public Student [] readFile(String fileName, Student student[], boolean displayData) {
		boolean problemFixed = false;
		System.out.println("Inside main");
		ProblemGenerator myproblem = new ProblemGenerator("filenamethatdoesnotexist.txt");
		
		do {
			try {
				problemFixed = myproblem.openFile();
				
				FileReader file = new FileReader(fileName);
				BufferedReader buffer = new BufferedReader(file);
				
				if(displayData == true) {
					System.out.printf(" SID\t\t  Scores");
				}
				
				boolean eof = false;
				
				while(!eof) {
					for (int r = 0; r < student.length; r++) { 		// 40			
						String line = buffer.readLine();					// Read each line
						if(line == null) {
							eof = true;
						}
						else {	// Keep reading (have one line already)
							StringTokenizer tokenizer = new StringTokenizer(line);
							int [] scoreArr = new int[5]; 	// create an scoreArr array to store 4 scores		
							
							while(tokenizer.hasMoreTokens()) {
								for (int c = 0; c < scoreArr.length; c++) {
									String newLine = tokenizer.nextToken();
								 
									if(newLine.length() == 4) {
										if(displayData == true) {
											System.out.printf("\n " + newLine + "\t");
										}
										int studentID = Integer.parseInt(newLine);
										student[r].setSID(studentID);	// save the studentID to student[i];
										break;
									}
									else {
										int scores = Integer.parseInt(newLine);
										if(displayData == true) {
											System.out.printf("%5d", scores);
										}
										scoreArr[c] = scores;	// put each scores into one scoreArr					
									}
								}
							}	// done for one line -- move to the next line
							student[r].setScores(scoreArr);	// save scoreArr (5 scores) to the student[i]
						} 
					}	
				}
				buffer.close();
			}
				
			catch(IOException e) {
					System.out.printf("Error -- " + e.toString());
			}
			catch(Repair e)
			{
				
					myproblem.setFileName(e.fixProblemReadFromConsole());
			}
			
		}while(problemFixed == false);

		return student;
	}
	
}
