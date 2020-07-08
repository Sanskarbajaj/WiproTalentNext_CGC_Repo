package Arrayss;

import java.util.Scanner;

public class sumAndAverage {

	public static void main(String[] args) {
		 int sum=0;
         Scanner s=new Scanner(System.in);
         System.out.print("Enter The Size of the Array : ");
         int size=s.nextInt();
         int arr[]=new int[size];
         
         System.out.println("Enter the elements of Array");
         
         for(int i=0;i<arr.length;i++)
            {
               arr[i]=s.nextInt();
               sum+=arr[i];
             }
               float avg=(float)(sum/arr.length);
               
              System.out.println("Sum is "+sum+" Average is "+avg);

	}

}
