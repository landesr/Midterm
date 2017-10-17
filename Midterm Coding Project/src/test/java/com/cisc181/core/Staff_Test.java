package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	static ArrayList<Staff> a;

	@BeforeClass
	public static void setup() {
		a=new ArrayList<Staff>();
		Date d=new Date();
		double salary=10;
		a.add(new Staff("a","a","a",d, "a","a","a","a",1,salary,d,eTitle.MR));
		salary=11;
		a.add(new Staff("a","a","a",d, "a","a","a","a",1,salary,d,eTitle.MR));
		salary=12;
		a.add(new Staff("a","a","a",d, "a","a","a","a",1,salary,d,eTitle.MR));
		salary=13;
		a.add(new Staff("a","a","a",d, "a","a","a","a",1,salary,d,eTitle.MR));
		salary=14;
		a.add(new Staff("a","a","a",d, "a","a","a","a",1,salary,d,eTitle.MR));
	}
	
	@Test
	public void test() {
		int x=0;
		int y=0;
		for(Staff s:a) {
			x+=s.getSalary();
			y+=1;
		}
			
		assertEquals(x/y,12);
	}	

}
