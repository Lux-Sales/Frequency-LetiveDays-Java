package entities;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Semester {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private Date begin;
	private Date end;
	
	public Semester(Date begin, Date end) {
		this.begin = begin;
		this.end = end;
	}

	public Date getBegin() {
		return begin;
	}

	public void setBegin(Date begin) {
		this.begin = begin;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}
	public long letiveDays(Date begin,Date end) {
		long diffInMillies = Math.abs(end.getTime() - begin.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
		return diff;
	}
	
	public int usefulDays(Date begin,Date end) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(begin);
		Calendar ending = Calendar.getInstance();
		ending.setTime(end);
		int usefulDays=0;
		while(cal.getTime()!= ending.getTime()) {
			if(cal.get(Calendar.DAY_OF_WEEK) == 1 || cal.get(Calendar.DAY_OF_WEEK) == 7 ) {
				System.out.println("begin:"+cal.getTime());
				System.out.println("end:"+ending.getTime());
				cal.add(cal.DATE, 1);
			}
			else {
				usefulDays++;
			cal.add(cal.DATE, 1);
			}}
		
		return usefulDays(begin, end);
	}
	
}
