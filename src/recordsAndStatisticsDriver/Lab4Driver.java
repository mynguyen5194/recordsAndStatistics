/*
 * Name: My Nguyen
 * Course: CIS 35A - 61Y
 * Assignment: #4
 * Project: #1
 * Due date: 03/01/2015
 * Data submitted: 03/01/2015
 * 
 * This program keeps records and performs statistical analysis for a class
 * of students (40 or less). There are five quizzes during the term. Each
 * student is identified by a four-­digit student ID number. The program will
 * read the file named "records.txt", which includes students' records. It
 * then prints the data and computes the statistics for each quiz.
 */

package recordsAndStatisticsDriver;

import classRecords.*;

public class Lab4Driver extends BridgeClassRecords implements ClassRecords{

	public static void main(String[] args) {
		
		Lab4Driver driver = new Lab4Driver();
		
		driver.ReadFile("records.txt");
		driver.PrintGrades("records.txt");
		driver.ComputeStats();
		
	}

}

/*
 * OUTPUT:
Inside main
FixProblems [errorno = 0, errormsg = null]
got here --> fixProblemReadFromConsole
Now it is done!

    SID				    Scores
    1234 	      52       7     100      78      34
    2134 	      90      36      90      77      30
    3124 	     100      45      20      90      70
    4532 	      11      17      81      32      77
    5678 	      20      12      45      78      34
    6134 	      34      80      55      78      45
    7874 	      60     100      56      78      78
    8026 	      70      10      66      78      56
    9893 	      34       9      77      78      20
    1947 	      45      40      88      78      55
    2877 	      55      50      99      78      80
    3189 	      22      70     100      78      77
    4602 	      89      50      91      78      60
    5405 	      11      11       0      78      10
    6999 	       0      98      89      78      20
High Scores:         100     100     100      90      80
Low Scores:          0       7       0      11      10
Average:	   46.2     42.3     70.5     75.7     49.7  
 */