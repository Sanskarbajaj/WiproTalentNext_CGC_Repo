import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;



public class CountFromFile_Ques1
{
   public static void main(String[] args)
   {
         System.out.println("Enter the file name ");
         Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         System.out.println("Enter the character to be counted  ");
         char ch=sc.next().charAt(0);
         s+=".txt";
         try
         {
         FileInputStream fis=new FileInputStream(s);
         int temp=fis.read();
         int count=0;

         while(temp!=-1)
         {
              if((char)temp == ch)
                count++;
              temp=fis.read();
         }
        System.out.println(ch+"   "+count);
        }
        catch(FileNotFoundException e)
        {
             System.out.println(e);
	}
        catch(IOException e)
        {
             System.out.println(e);
	}
         
   }
}