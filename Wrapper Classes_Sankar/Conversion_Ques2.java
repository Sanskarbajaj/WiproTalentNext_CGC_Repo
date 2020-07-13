public class Conversion_Ques2
{
   public static void main(String[] args)
   {
        int x=Integer.parseInt(args[0]);
        System.out.println("Given Number : "+x);
        System.out.println("Binary Equivalent  : "+Integer.toBinaryString(x));
        System.out.println("Octal Equivalent  : "+Integer.toOctalString(x));
        System.out.println("Hexadecimal Equivalent  : "+Integer.toHexString(x));
        
   }
}