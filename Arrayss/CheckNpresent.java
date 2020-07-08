package Arrayss;

import java.util.Scanner;

public class CheckNpresent {

	public static void main(String[] args) {
	int arr[]=new int[] {1,2,3,4,56,7,8};
	Scanner s=new Scanner(System.in);
	int key=s.nextInt();
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]==key)
		{
			System.out.println(i);
			return;
		}
	}
	System.out.println("-1");

	}

}
