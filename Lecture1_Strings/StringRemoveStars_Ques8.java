import java.util.Scanner;
public class StringRemoveStars_Ques8
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         String str=sc.nextLine();
         String s="";
         for(int i=0;i<str.length();i++)
         {
             if(str.charAt(i)=='*')
             {
                s=s.substring(0,s.length()-1);
                i++;
             }
             else
              {
                 s+=str.charAt(i);
              }

         }
          System.out.println(s);
    }
  

}