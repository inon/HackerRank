package hackerank.algorithms.warmup;

import java.util.Scanner;
/**
 * Problem Statement

The Head Librarian at a library wants you to make a program that calculates the fine for returning the book after the return date. You are given the actual and the expected return dates. Calculate the fine as follows:

If the book is returned on or before the expected return date, no fine will be charged, in other words fine is 0.
If the book is returned in the same month as the expected return date, Fine = 15 Hackos × Number of late days
If the book is not returned in the same month but in the same year as the expected return date, Fine = 500 Hackos × Number of late months
If the book is not returned in the same year, the fine is fixed at 10000 Hackos.
Input Format

You are given the actual and the expected return dates in D M Y format respectively. There are two lines of input. The first line contains the D M Y values for the actual return date and the next line contains the D M Y values for the expected return date.

Constraints 
1≤D≤31 
1≤M≤12 
1≤Y≤3000
Output Format

Output a single value equal to the fine.

Sample Input

9 6 2015
6 6 2015
Sample Output

45
 */
public class LibraryFine {

	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int actualDay = s.nextInt();
		int actualMonth = s.nextInt();
		int actualYear = s.nextInt();
		
		int expectedDay = s.nextInt();
		int expectedMonth = s.nextInt();
		int expectedYear = s.nextInt();
		
//		System.out.println("Actual : " + actualDay + " - " + actualMonth + " - "+ actualYear);
//		System.out.println("Expected : " + expectedDay + " - " + expectedMonth + " - "+ expectedYear);
		
		int fine = 0;
		
		if(actualYear == expectedYear && actualMonth == expectedMonth && actualDay <= expectedDay){
			fine = 0;
		}else if(actualYear == expectedYear && actualMonth == expectedMonth && actualDay > expectedDay){
			int lateDays = actualDay - expectedDay;
			fine = 15 * lateDays;
		}else if (actualYear == expectedYear && actualMonth > expectedMonth){
			int lateMonths = actualMonth - expectedMonth;
			fine = 500 * lateMonths;
		}else if(actualYear > expectedYear){
			fine = 10000;
		}
		
		System.out.println(fine);
		s.close();
	}
}
