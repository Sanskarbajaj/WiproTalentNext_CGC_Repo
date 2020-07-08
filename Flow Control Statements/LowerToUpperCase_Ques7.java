public class LowerToUpperCase_Ques7
{
   public static void main(String[] args)
   {
        char ch='Z';
        if(ch>='a' && ch<='z')
            ch-=32;
        else
            ch+=32;

        System.out.println(ch);
   }
}

