package Arrayss;

import java.util.HashSet;
import java.util.Iterator;



public class removeDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[] {1,2,3,4,1,3,2};
		HashSet<Integer>s=new HashSet<>();
		for(int x:arr)
		{
			s.add(x);
		}
		Iterator it= s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
