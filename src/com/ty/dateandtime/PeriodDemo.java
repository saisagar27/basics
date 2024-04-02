package com.ty.dateandtime;

import java.time.*;

public class PeriodDemo {
	public static void main(String[] args) {
		
		LocalDate birthday=LocalDate.of(1999, 02, 5);
		LocalDate current=LocalDate.now();
		Period p=Period.between(birthday,current);
		System.out.println(p.getYears()+" years "+p.getMonths()+" Months "+p.getDays()+" Days");
		
	}

}
