public class CommandLineArgument_Ques3
{
     public static void main(String[] args)
     {
         java.util.Scanner sc=new java.util.Scanner(System.in);
        
        
         if(args.length==0)
           System.out.println("No Values");
         else
           System.out.println(java.util.Arrays.toString( args) );
     }
 
}