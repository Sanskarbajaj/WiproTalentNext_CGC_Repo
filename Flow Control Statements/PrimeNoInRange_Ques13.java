import java.util.Scanner;
public class PrimeNoInRange_Ques13
{
   public static void main(String[] args)
   {
     for(int j=10;j<=99;j++)
     {

     int count=0;
      for(int i=2;i<=j/2;i++)
      {
            if(j%i==0)
            {
                  count++;
                  break;
            }
      }  
      if(count==0)
            System.out.println(j+" Is Prime");
      else
             System.out.println(j+" is Not Prime");
       
      }

   }
}

