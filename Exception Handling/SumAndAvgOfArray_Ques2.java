import java.util.*;
public class SumAndAvgOfArray_Ques2
{
   public static void main(String[] args) 
   {  
        
      int arr[]=new int[args.length];
      try
      {
      for(int i=0;i<args.length;i++)
          arr[i]=Integer.parseInt(args[i]);       //Number format exception or array index out of bound

     float sum=0;
     for(int i=0;i<arr.length;i++)
          sum+=arr[i];
       
     System.out.println("Sum is : "+sum);
     System.out.println("Average is : "+sum/arr.length);
     }
    catch(ArrayIndexOutOfBoundsException e)
    {
        System.out.println(e);
    }
    catch(NumberFormatException e)
    {
       System.out.println(e);
    }
    catch(ArithmeticException e)
    {
       System.out.println(e);
    }

   }
}