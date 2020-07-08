public class CompareLastTwoDigit_Ques1B
{
     public static void main(String[] args)
     {
         java.util.Scanner sc=new java.util.Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         if(a%10==b%10)
           System.out.println("true");
         else
           System.out.println("false");
     }
 
}