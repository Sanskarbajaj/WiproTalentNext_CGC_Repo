public class Fruit_Ques1
{
   public static void main(String[] args)
  {
       Fruit f=new Fruit();
       f.name="papaya";
       f.taste="sweet";
       f.eat();

       Apple a=new Apple();
       a.name="apple";
       a.taste="khata metha";
       a.eat();
  }
}



class Fruit
{

  String name,taste;
  int size;

  void eat()
  {
      System.out.println(name+"      "+taste);
  }
}

class Apple extends Fruit
{
     void eat()
     {
        System.out.println(name+"      "+taste);
     }
}

class Orange extends Fruit
{
     void eat()
     {
         System.out.println(name+"      "+taste);     
     }
}