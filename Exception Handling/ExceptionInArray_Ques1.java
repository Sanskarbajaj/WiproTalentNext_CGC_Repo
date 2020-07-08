import java.util.Scanner;
import java.util.*;
public class ExceptionInArray_Ques1
{
   public static void main(String[] args) 
   {  
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array : ");
        int n=sc.nextInt();
        System.out.print("Enter the elements in the array : ");
        int[] arr=new int[n];

         try
         {

        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.print("Enter the index of the array element you want to access : ");
        int index=sc.nextInt();
        System.out.println("The element at index "+index+" = "+arr[index]);
        System.out.println("The array element successfully accessed");
        }

        catch(InputMismatchException e)
         {
            System.out.println(e);
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
             System.out.println(e);
         }

   }
}