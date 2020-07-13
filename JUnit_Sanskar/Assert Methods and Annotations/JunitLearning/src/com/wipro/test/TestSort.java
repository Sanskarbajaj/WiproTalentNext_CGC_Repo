package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

	@Test
	public void test() {
		
		DailyTasks obj=new DailyTasks();
		int arr[]= {98,6,25};
		arr=obj.sortValues(arr);
		int res[]= {6,25,98};
		assertArrayEquals( arr,res);
	}

}
