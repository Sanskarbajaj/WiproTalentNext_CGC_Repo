import java.util.Scanner;
public class PrintDesign_Ques15
{
   public static void main(String[] args)
   {
   
      if(args.length==0)
           System.out.println("Enter an Integer value");
      else
       {
          int n=Integer.parseInt(args[0]);
          
           for(int i=0;i<n;i++)
           {
                 for(int j=0;j<=i;j++)
                   System.out.print("*  ");
               System.out.println();
           }
       }
   }
}

