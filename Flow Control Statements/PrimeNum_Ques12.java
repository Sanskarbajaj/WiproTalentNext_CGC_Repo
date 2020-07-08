import java.util.Scanner;

public class PrimeNum_Ques12
{
     public static void main(String[] args)
     {
         int n=new Scanner(System.in).nextInt();
         
         int count=0;
         for(int i=2;i<=n/2;i++)
         {
               if(n%i==0)
                 count++;
         }
          if(count==0)
               System.out.print("Number is Prime");
          else
               System.out.print("Number is Not Prime");
     }
 
}