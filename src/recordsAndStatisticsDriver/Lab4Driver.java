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
