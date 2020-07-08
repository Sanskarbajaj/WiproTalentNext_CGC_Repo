import java.util.Scanner;

public class ReverseTheNum_Ques16
{
     public static void main(String[] args)
     {
         int n=new Scanner(System.in).nextInt();
         
         int rev=0,rem=0;
     
         while(n!=0)
         {
             rem=n%10;
             rev=rev*10+rem;
             n/=10;
         }
        
         System.out.print(rev);
     }
 
}
           