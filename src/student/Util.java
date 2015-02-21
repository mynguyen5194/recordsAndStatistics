package student;
import java.io.*;
import java.util.StringTokenizer;

public class Util {
	public void readFile(Student [] student) {
		try {
			FileReader file = new FileReader("records.txt");
			BufferedReader buffer = new BufferedReader(file);
			
			boolean eof = false;
			while(!eof) {
				String line = buffer.readLine();
				if(line == null) {
					eof = true;
				}
				else {
					StringTokenizer tokenizer = new StringTokenizer(line);
					while(tokenizer.hasMoreTokens()) {
						String token = tokenizer.nextToken();
						
						for(int i = 0; i < student.length; i++) {
							int scoreArr[] = new int[5];	// Create a new scoreArr to store 5 scores
							
							// Save the SID
							if(token.length() == 4) {
								int studentID = Integer.parseInt(token);
								student[i].setSID(studentID);
							}
						
							// Save the scores to a scoreArr array
							else {
								int scores = Integer.parseInt(token);		
								for(int j = 0; j < scoreArr.length; j++) {
									scoreArr[i] = scores;
								}
							}		
							student[i].setScores(scoreArr);	// Save the scoreArr array to the score field
							
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
