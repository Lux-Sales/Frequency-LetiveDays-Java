package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


import entities.Semester;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Enter the semester's begin date(dd/MM/yyyy): ");
		try{
		Date begin = sdf.parse(sc.next());
		System.out.println("Enter the semester's end date(dd/MM/yyyy): ");
		Date end = sdf.parse(sc.next());
		Semester semester = new Semester(begin, end);
	    System.out.println("Letive days:" + semester.letiveDays(begin, end));
		}
		catch(ParseException e) {
			System.out.println("Error in date: " + e.getMessage());
		}
		finally {
			sc.close();
		}
	}

}
