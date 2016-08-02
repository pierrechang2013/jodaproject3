package com.decarie.test;

import static org.hamcrest.CoreMatchers.anyOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.startsWith;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.decarie.joda.HemcrestTest;

public class HemcrestTestTest {
	
	HemcrestTest ht = null;

	@Before
	public void setUp() throws Exception {
		ht = new HemcrestTest();
		
	}

	@Test
	public void testSetValues() {
		//fail("Not yet implemented");
		
		assertThat(ht.setValues(),hasItems(anyOf(equalTo("Z"))));
	}
	
	@Test
	public void TestSetValue() {
		//fail("Not yet implemented");
		
		assertThat(ht.setValue(),startsWith("Q"));//区分大小写
	}

}
