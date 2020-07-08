import java.util.Scanner;
public class StringConcat_Ques2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        String str3;
        if( str1.charAt(str1.length()-1) == str2.charAt(0) )
          
               str3=str1.toLowerCase()+str2.toLowerCase().substring(1);
          
        else
              str3=str1.toLowerCase()+str2.toLowerCase();
      
        System.out.println(str3);
                 
    }

}