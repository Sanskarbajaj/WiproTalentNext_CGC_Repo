public class Person_Ques5
{ 
  
  public static void main(String[] args)
  {

      try
      {
       String name=args[0];
       int age=Integer.parseInt(args[1]);
       if(age<18 || age>=60)
             throw new AgeIssue("Age should lies be between 18 and 60");

       }
       
       catch(AgeIssue e)
       {
            System.out.println(e.getMessage());
       } 
       catch(NumberFormatException e)
       {
             System.out.println(e.getMessage());
       } 
       catch(ArrayIndexOutOfBoundsException e)
       {
             System.out.println(e.getMessage());
       } 
  }

}

class AgeIssue extends Exception
{
      public AgeIssue(String s)
      {
            super(s);
      }
}