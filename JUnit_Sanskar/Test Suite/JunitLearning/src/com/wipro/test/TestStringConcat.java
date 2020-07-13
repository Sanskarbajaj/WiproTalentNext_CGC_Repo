package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.wipro.task.*;

public class TestStringConcat {

	@Test
	public void test() {
		DailyTasks obj=new DailyTasks();
		String s=obj.doStringConcat("shahin","ansari");
		assertEquals(s,"shahin ansari");
	}

}
