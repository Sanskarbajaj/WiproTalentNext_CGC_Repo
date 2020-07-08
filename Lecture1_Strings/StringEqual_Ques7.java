import java.util.Scanner;
public class StringEqual_Ques7
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         String str1=sc.nextLine();
         
         if(str1.charAt(0)=='x' && str1.charAt(str1.length()-1)=='x')
            System.out.println(str1.substring(1,str1.length()-1));
         else
            System.out.println(str1);
                 
    }
  

}