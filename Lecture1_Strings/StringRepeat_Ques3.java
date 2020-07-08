import java.util.Scanner;
public class StringRepeat_Ques3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        int n=sc.nextInt();
        String str2=new String();
        for(int i=0;i<n;i++)
              str2+=str1.substring(0,2);
        System.out.println(str2);
                 
    }

}