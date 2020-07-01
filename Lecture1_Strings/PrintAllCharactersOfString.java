package Lecture1_Strings;

import java.util.Scanner;

public class PrintAllCharactersOfString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String getString=s.nextLine();
		String str=new String(getString);
		printChars(str);
		
	}
	public static void printChars(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				
			}else
			System.out.println(str.charAt(i));
		}
	}

}
