public class Box_Ques1
{
   private int length,width,height;
 
   public Box_Ques1(int l,int w,int h)
   {
     length=l;  width=w;  height=h;
   }
   public int volume()
   {
      return length*width*height;
   }

   public static void main(String[] args)
   {
           Box_Ques1 b=new Box_Ques1(12,10,5);
           System.out.println(b.volume());
   }
}