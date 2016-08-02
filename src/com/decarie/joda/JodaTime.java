package com.decarie.joda;

import java.text.ParseException;

import org.joda.time.DateTime;
import org.joda.time.Days;
import org.joda.time.Hours;
import org.joda.time.Interval;
import org.joda.time.Minutes;
import org.joda.time.Period;
import org.joda.time.Seconds;
import org.joda.time.PeriodType;

public class JodaTime {

	public JodaTime() {
		// TODO Auto-generated constructor stub
	}
	
	public void test1() throws ParseException {
		DateTime dt1 = new DateTime(2016, 2, 14, 16, 0, 0, 0);
		DateTime dt2 = new DateTime(2016, 2, 15, 16, 0, 0, 0);
		System.out.print("测试:");
		System.out.print(Days.daysBetween(dt1, dt2).getDays() + " 天 ");
		System.out.print(Hours.hoursBetween(dt1, dt2).getHours() % 24 + " 小时 ");
		System.out.print(Minutes.minutesBetween(dt1, dt2).getMinutes() % 60
				+ " 分 ");
		System.out.print(Seconds.secondsBetween(dt1, dt2).getSeconds() % 60
				+ "秒.");
		System.out.println();
	}
	
	public TimeResult getPeriod(DateTime dateTimeStart,DateTime dateTimeEnd){
		
		//Interval interval = new Interval(dateTimeStart,dateTimeEnd);
        
		int days = Days.daysBetween(dateTimeStart, dateTimeEnd).getDays();
		
		TimeResult tr = new TimeResult();
		
		tr.setDay(days);
		
		return tr;
		
	}

}
