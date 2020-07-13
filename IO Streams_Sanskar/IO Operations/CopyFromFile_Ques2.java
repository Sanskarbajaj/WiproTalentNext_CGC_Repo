import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;


public class CopyFromFile_Ques2
{
   public static void main(String[] args)
   {
         System.out.println("Enter the input file name ");
         Scanner sc=new Scanner(System.in);
         String inp=sc.nextLine();
         System.out.println("Enter the output file name  ");
         String otp=sc.nextLine();

         inp+=".txt";
         otp+=".txt";
         try
         {
         FileInputStream fis=new FileInputStream(inp);
         FileOutputStream fos =new FileOutputStream(otp);

         int temp=fis.read();
        

         while(temp!=-1)
         {
              fos.write((char)temp);
              temp=fis.read();
         }
          fis.close();
          fos.close();
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