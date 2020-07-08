import java.util.Scanner;
public class Student_Ques4
{ 
  
  public static void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     UserRegistration u=new UserRegistration();

     System.out.print("Enter your name : ");
     String name=sc.nextLine();
    System.out.print("Enter your Country : "); 
     String cname=sc.nextLine();
 
     try{
     u.registerUser(name,cname);
     }
     catch(InvalidCountryException e)
     {
         System.out.println(e.getMessage());
     }

  }

}

class InvalidCountryException extends Exception
{
      public InvalidCountryException(String s)
      {
            super(s);
      }
}

class UserRegistration
{
   String name,country;

   void registerUser(String username,String userCountry) throws InvalidCountryException
   {
        if(userCountry.equalsIgnoreCase("india") )
        {
             name=username;
            country=userCountry;
           System.out.println("user registration  done successfully");
            
        }
        else
        {
             throw new InvalidCountryException("User Outside India cannot be registered");
        }
   }
}