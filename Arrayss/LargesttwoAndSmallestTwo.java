package Arrayss;

import java.util.Arrays;

public class LargesttwoAndSmallestTwo {

	public static void main(String[] args) throws Exception {
		int arr[]=new int[] {1,2,3,4,5,6};
		if(arr.length<4)
		{
			throw new Exception("atleast 4 no should be there");
		}
		Arrays.sort(arr);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
		
		
		System.out.println(arr[arr.length-1]);
		System.out.println(arr[arr.length-2]);
	}

}
