package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

	@Test
	public void test() {
		DailyTasks obj=new DailyTasks();
		String s1="shahin";
		String s2="sha";
		boolean b=obj.checkPresence(s1, s2);
		assertTrue(b);
	}

}
