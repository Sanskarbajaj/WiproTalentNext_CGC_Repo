package Lecture1_Strings;

import java.util.Scanner;

public class ProgramToUpperAndLowercase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String getString=s.nextLine();
		String str=new String(getString);
		upperlower(str);
	}
	public static void upperlower(String str)
	{
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
	}

}
