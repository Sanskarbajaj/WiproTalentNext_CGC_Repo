package Arrayss;

import java.util.ArrayList;

public class WithoutTen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[]=new Integer[] {1,10,10,2};
		ArrayList<Integer>al=new ArrayList<Integer>();
		int c=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==10)
			{
				al.add(0);
				c++;
			}
			else
			{
				al.add(arr[i]);
			}
		}
		System.out.println(al);
		int ar[]=new int[arr.length];
		int j=0;
		for(int i=0;i<ar.length;i++)
		{
			if(al.get(i)==0)
			{
			
			}
			else
			{
				ar[j]=al.get(i);
				j++;
			}
		}
for(int x:ar)
{
	System.out.println(x);
}
		
	

	}

}
