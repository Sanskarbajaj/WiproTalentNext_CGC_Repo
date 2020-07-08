package Arrayss;

import java.util.ArrayList;

public class EvenComesBefore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]=new int[] {1,2,2,1,3,5};
ArrayList<Integer>al=new ArrayList<Integer>();

ArrayList<Integer>all=new ArrayList<Integer>();
for(int x:arr)
{
	if(x%2==0)
	{
		al.add(x);
	}
	else
	{
		all.add(x);
	}
}
int arrr[]=new int[arr.length];
int j=0;
while(!all.isEmpty())
{
	al.add(all.remove(j));
}
for(int i=0;i<arrr.length;i++)
{
	arr[i]=al.get(i);
}
//same for arr
System.out.println(al);
	}
	

}
