public class CheckPtvNegtv_Ques1A
{
     public static void main(String[] args)
     {
         java.util.Scanner sc=new java.util.Scanner(System.in);
         int n=sc.nextInt();
         if(n<0)
            System.out.println("Number is Negative ");
         else if(n==0)
            System.out.println("Number is Zero ");
         else
            System.out.println("Number is Positive ");
     }
 
}