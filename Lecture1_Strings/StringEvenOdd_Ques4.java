import java.util.Scanner;
public class StringEvenOdd_Ques4
{
    public static void main(String[] args)
    {
        
       String s=StringEvenOdd_Ques4.EvenOdd();
       System.out.println(s);
                 
    }
    public static String EvenOdd()
    {
         Scanner sc=new Scanner(System.in);
         String str1=sc.nextLine();
         if(str1.length()%2==0)
         {
             return str1.substring(0,str1.length()/2 );
         }
         else
         {
             return null;
         }
    }

}