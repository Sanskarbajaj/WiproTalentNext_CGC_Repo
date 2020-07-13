import java.util.Scanner;

public class BinaryString_Ques3
{
   public static void main(String[] args)
   {
           Scanner sc=new Scanner(System.in);
           System.out.print("Enter a number : ");
           int n=sc.nextInt();
           String s=Integer.toBinaryString(n);
           String str=String.format("%8s",s);
           String s2=str.replace(" ","0");

           System.out.println(s2);      
   }
}