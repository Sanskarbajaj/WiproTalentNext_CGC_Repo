public class AnimalAndBird_Ques1
{
  public static void main(String[] args)
  {
     Animal a=new Animal();
     a.eat();
     a.sleep();
     Bird b=new Bird();
     b.eat();
     b.sleep();
     b.fly();
  }
}

class Animal
{
     void eat()
     {
          System.out.println("Eat method of Animal");
     }
     void sleep()
     {
          System.out.println("Sleep method of Animal");
     }
}

class Bird extends Animal
{
   void eat()
     {
          System.out.println("Eat method of Bird");
     }
     void sleep()
     {
          System.out.println("Sleep method of Bird");
     }
    void fly()
    {
          System.out.println("Fly method of Bird");
    }
}
