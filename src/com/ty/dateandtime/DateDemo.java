package com.ty.dateandtime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class DateDemo {
	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println(date);
		int dd=date.getDayOfMonth();
		int mm=date.getMonthValue();
		int yy=date.getYear();
		System.out.println(dd+" : " +mm+" : " +yy);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		int h= time.getHour();
		int m= time.getMinute();
		int s= time.getSecond();
		int ns=time.getNano();
		System.out.println(h+"-"+m+"-"+s+"-"+ns);
		
		LocalDateTime l=LocalDateTime.of(1995,05,22,20,5,8,5);
		System.out.println(l);
		System.out.println("After 5 months "+l.plusMonths(5));
		System.out.println("Befor 3 months "+l.minusMonths(3));
		
		
		
		
	}

}
