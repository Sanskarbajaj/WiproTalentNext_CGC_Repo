import java.util.Scanner;

public class SumOfDigits_Ques14
{
     public static void main(String[] args)
     {
         int n=new Scanner(System.in).nextInt();
         
         int sum=0;
         while(n!=0)
         {
             sum+=n%10;
             n=n/10;
         }
         System.out.print(sum);
     }
 
}