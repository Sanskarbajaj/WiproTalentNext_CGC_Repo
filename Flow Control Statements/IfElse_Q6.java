import java.util.Scanner;
public class IfElse_Q6
{
  public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the gender : ");
        String gen=sc.nextLine();

        System.out.print("Enter the Age : ");
        int age=sc.nextInt();
        
        if( gen.equals("Female") && (age>=1 && age<=58) )
             System.out.println("The percentage of interest is 8.2%");
        else  if( gen.equals("Female") && (age>=59 && age<=100) )
             System.out.println("The percentage of interest is 9.2%");
        else if( gen.equals("Male") && (age>=1 && age<=58) )
             System.out.println("The percentage of interest is 8.4%");
        else  
             System.out.println("The percentage of interest is 10.5%");
          
        
  }
}