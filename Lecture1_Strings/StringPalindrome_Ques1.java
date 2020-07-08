public class StringPalindrome_Ques1
{
    public static void main(String[] args)
    {
        String str="urft";
        int f=0,l=str.length()-1;
        while(f<l)
        {
           if(str.charAt(f)!=str.charAt(l) )
           {    
               break;
           }
           f++;
           l--;
        }
        if(f==l)
             System.out.println("String is Palindrome");
        else if(str.charAt(f)==str.charAt(l))
               System.out.println("String is Palindrome");
        else
                 System.out.println("String is Not Palindrome");          
    }

}