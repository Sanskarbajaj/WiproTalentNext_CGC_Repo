import java.util.Scanner;
public class RepeatLastChars_Ques10
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         StringBuffer s1=new StringBuffer(sc.nextLine());
         int n=sc.nextInt();
         StringBuffer s2=new StringBuffer();
         for(int i=0;i<n;i++)
         {
           s2.append( s1.substring(s1.length()-n) );
         }
         System.out.println(s2);
    }
  

}