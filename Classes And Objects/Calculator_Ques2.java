class Calculator_Ques2
{

   public static void main(String[] args)
   {
       System.out.println(Calculator_Ques2.powerInt(2,5));

      System.out.println(Calculator_Ques2.powerDouble(2.0,5));

   }

   static int powerInt(int num1,int num2)
   {
          return (int)Math.pow(num1,num2);
   }
   static double powerDouble(double num1,int num2)
   {
             return Math.pow(num1,num2);
   }
}