package com.gagan.dates.service;

import com.gagan.dates.MyDate;

public class DateDifferenceProvider {
	
	
	private static int JAN = 31;
	private static int FEB = 28;
	private static int MAR = 31;
	private static int APR = 30;
	private static int MAY = 31;
	private static int JUN = 30;
	private static int JUL = 31;
	private static int AUG = 31;
	private static int SEP = 30;
	private static int OCT = 31;
	private static int NOV = 30;
	private static int DEC = 31;
	
	private static final int DAYS_IN_MONTH[] = {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};

	public static int getDateDifference(MyDate startDate, MyDate endDate) {

		if(sameDate(startDate, endDate) && sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
			return 0;
		}
		else if(sameMonth(startDate, endDate) && sameYear(startDate, endDate)) {
			return endDate.getDd() - startDate.getDd();
		}
		else if(sameYear(startDate, endDate) && !(sameMonth(startDate, endDate))) {
			return remainingDaysInMonth(startDate) + daysInIntervingMonth(startDate, endDate) + leadingMonth(endDate);
		}
		else {
			return remainingDaysInYear(startDate) + daysInIntervingYear(startDate, endDate) + leadingYear(endDate);
		}
	}
	
	private static boolean sameDate(MyDate startDate, MyDate endDate) {
		return startDate.getDd() == endDate.getDd();
	}
	
	private static boolean sameMonth(MyDate startDate, MyDate endDate) {
		return startDate.getMm() == endDate.getMm();
	}
	
	private static boolean sameYear(MyDate startDate, MyDate endDate) {
		return startDate.getYyyy() == endDate.getYyyy();
	}
	
	private static int remainingDaysInMonth(MyDate startDate) {
		return DAYS_IN_MONTH[startDate.getMm() - 1] - startDate.getDd();
	}
	
	private static int daysInIntervingMonth(MyDate startDate, MyDate endDate) {
		int days = 0;
		for(int month = startDate.getMm(); month < endDate.getMm() - 1; month++) {
			days += DAYS_IN_MONTH[month];
		}
		if(isFebruary(startDate, endDate) && isLeapYear(startDate.getYyyy())) {
			days++;
		}
		return days;
	}
	
	private static int leadingMonth(MyDate endDate) {
		return endDate.getDd();
	}
	
	private static int remainingDaysInYear(MyDate startDate) {
		int days = remainingDaysInMonth(startDate);
		for(int month = startDate.getMm(); month < 12; month++) {
			days += DAYS_IN_MONTH[month];
		}
		return days;
	}
	
	private static int daysInIntervingYear(MyDate startDate, MyDate endDate) {
		int days = 0;
		int years = 0;
		years = endDate.getYyyy() - startDate.getYyyy() - 1;
		for(int year = startDate.getYyyy(); year < endDate.getYyyy(); year++ ) {
			if(isLeapYear(year))
				days++;
		}
		days += 365 * years;
		if(isLeapYear(startDate.getYyyy())) {
			days++;
		}
		return days;
	}
	
	private static int leadingYear(MyDate endDate) {
		int days = 0;
		if(isLeapYear(endDate.getYyyy())) {
			days++;
		}
		for(int month = 0; month < endDate.getMm() - 1; month++) {
			days += DAYS_IN_MONTH[month];
		}
		days += leadingMonth(endDate);
		return days;
	}
	
	public static boolean isLeapYear(int year) {
		  if (year % 4 != 0) {
		    return false;
		  } else if (year % 400 == 0) {
		    return true;
		  } else if (year % 100 == 0) {
		    return false;
		  } else {
		    return true;
		  }
		}
	
	public static boolean isFebruary(MyDate startDate, MyDate endDate) {
		for(int month = startDate.getMm() - 1; month < endDate.getMm(); month++) {
			if(DAYS_IN_MONTH[month]==FEB) {
				return true;
			}
		}
		return false;
	}
}
