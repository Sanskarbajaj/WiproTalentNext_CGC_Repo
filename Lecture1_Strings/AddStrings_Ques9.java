import java.util.Scanner;
public class AddStrings_Ques9
{
    public static void main(String[] args)
    {
         Scanner sc=new Scanner(System.in);
         StringBuffer s1=new StringBuffer(sc.nextLine());
         StringBuffer s2=new StringBuffer(sc.nextLine());
         int i=0;
         StringBuffer res=new StringBuffer();
         while(i<s1.length() && i<s2.length())
         {
            res.append(s1.charAt(i));
            res.append(s2.charAt(i));
            i++;
         }
         while(i<s1.length())
         {
            res.append(s1.charAt(i));
            i++;
         }
          while(i<s2.length())
         {
            res.append(s2.charAt(i));
            i++;
         }
         System.out.print(res);
    }
  

}