import java.util.Scanner;

public class PalindromeNum_Ques17
{
     public static void main(String[] args)
     {
         int n=new Scanner(System.in).nextInt();
         
         int rev=0,rem=0;
         int temp=n;
         while(n!=0)
         {
             rem=n%10;
             rev=rev*10+rem;
             n/=10;
         }
         System.out.println(rev);
         if(temp==rev)
             System.out.println("Number is Palindrome");
         else
            System.out.println("Number is Not Palindrome");
     }
 
}
           