package Lecture1_Strings;

import java.util.Scanner;

public class FunctionToCompareStrings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=new String("Hello");
		String s2="Hello";
		String s3="Hello";
		String s4=new String("HelloSir");
		showComparisons(s1, s2, s3, s4);
	}
	public static void showComparisons(String a,String b,String c,String d)
	{
		if(a==b)
		{
			System.out.println("address of a and b are same/same memory");
		}
		if(b==c)
		{
			System.out.println("address of b and c are same/same memory");
		}
		if(a.equals(b))
		{
			System.out.println("same content/value of a and b");
		}
		if(b.equals(c))
		{
			System.out.println("same content/value of b and c");
		}
		
		System.out.println(b.compareTo(a));
		System.out.println(a.compareTo(d));
		
		
	}

}
