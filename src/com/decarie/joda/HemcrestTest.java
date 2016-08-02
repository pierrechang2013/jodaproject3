package com.decarie.joda;

import java.util.ArrayList;
import java.util.List;

public class HemcrestTest {
	
	private List<String> strList = null;
	private String value = null;

	public HemcrestTest() {
		// TODO Auto-generated constructor stub
	}
	
	public List<String> setValues(){
		
		strList = new ArrayList<String>();
		
		strList.add("X");
		strList.add("Y");
		strList.add("Z");
		
		return strList;
		
	}
	
    public String setValue(){
		
		value = "QWERTYUIOP";
		
		
		return value;
		
	}

}
