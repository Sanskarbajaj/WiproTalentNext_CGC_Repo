package Arrayss;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[][] {{1,2},{3,4}};
		ArrayList<Integer>al=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				al.add(arr[i][j]);
			}
		}
		int p=0;
		Collections.reverse(al);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=al.get(p);
				p++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

}
