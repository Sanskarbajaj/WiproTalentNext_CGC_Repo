import java.util.*;
public class ColorWithCode_Q8
{
  public static void main(String[] args)
  {
      Map<Character,String> map=new HashMap<>();
      map.put('R',"Red");
      map.put('B',"Blue");
      map.put('G',"Green");
      map.put('O',"Orange");
      map.put('Y',"Yellow");
      map.put('W',"White");

      System.out.print("Enter the color code : ");
      char ch=new Scanner(System.in).next().charAt(0);
     
      if(map.containsKey(ch))
         System.out.println(map.get(ch));
      else
         System.out.println("Invalid Values");

  }
}