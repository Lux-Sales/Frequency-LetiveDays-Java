package applications;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import entities.Semester;;

public class Main {

	public static void main(String[] args) throws java.text.ParseException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the semester's begin date(dd/MM/yyyy): ");
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date begin = sdf.parse(sc.next());
			Calendar cal = Calendar.getInstance();
			cal.setTime(begin);
			System.out.println("Enter the semester's end date(dd/MM/yyyy): ");
			Date end = sdf.parse(sc.next());
			Semester semester = new Semester(begin, end);
			System.out.println();
			System.out.println("Useful days:" + semester.usefulDays(begin, end));
			System.out.println("Letive days:" + semester.letiveDays(begin, end));
			

		} catch (ParseException e) {
			System.out.println("Error in date: " + e.getMessage());
		} catch (java.text.ParseException e) {

			System.out.println("Error in date: " + e.getMessage());
		} finally {

			sc.close();
		}
	}

}
