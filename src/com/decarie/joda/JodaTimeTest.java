package com.decarie.joda;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

public class JodaTimeTest {
	
	JodaTime jt = null;

	@Before
	public void setUp() throws Exception {
		
		 jt = new JodaTime();
	}

	@Test
	public void testGetPeriod() {
		//fail("Not yet implemented");
		DateTime dateTimeStart = new DateTime(2012,10,03,0,0,0,0);
		DateTime dateTimeEnd = new DateTime(2012,10,26,0,0,0,0);
		TimeResult tr = jt.getPeriod(dateTimeStart, dateTimeEnd);
		System.out.println("相差时间："+tr.getDay());
		int i = tr.getDay();
		
		DateTime dateTimeStart2 = new DateTime(2013,01,03,0,0,0,0);
		DateTime dateTimeEnd2 = new DateTime(2013,04,24,0,0,0,0);
		tr = jt.getPeriod(dateTimeStart2, dateTimeEnd2);
		System.out.println("相差时间："+tr.getDay());
		int j = tr.getDay();
		
		System.out.println("总共相差时间："+(i+j));
		
		
		
		
	}

}
