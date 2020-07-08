public class Shape_Ques2
{
   public static void main(String[] args)
   {
         Shape s1=new Shape();
         Shape s2=new Circle();
         Shape s3=new Triangle();
         Shape s4=new Square();
         s1.draw();
         s1.erase();
         s2.draw();
         s2.erase();
         s3.draw();
         s3.erase();
         s4.draw();
         s4.erase();
   }
}



class Shape
{
  void draw()
  {
       System.out.println("Drawing Shape");
  }
  void erase()
  {
       System.out.println("Erasing Shape");
  }
}
class Circle extends Shape
{
  void draw()
  {
       System.out.println("Drawing Circle");
  }
  void erase()
  {
       System.out.println("Erasing Circle");
  }
}
class Triangle extends Shape
{
  void draw()
  {
       System.out.println("Drawing Triangle");
  }
  void erase()
  {
       System.out.println("Erasing Triangle");
  }
}
class Square extends Shape
{
  void draw()
  {
       System.out.println("Drawing Square");
  }
  void erase()
  {
       System.out.println("Erasing Square");
  }
}