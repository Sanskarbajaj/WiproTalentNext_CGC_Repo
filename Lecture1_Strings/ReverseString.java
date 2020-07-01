package Lecture1_Strings;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String getString=s.nextLine();
		String str=new String(getString);
		reverse(str);

	}
public static void reverse(String str)
{
	StringBuilder sb=new StringBuilder(str);
	sb=sb.reverse();
	System.out.println(sb);
	//we can return a string using toString fn
}
}
