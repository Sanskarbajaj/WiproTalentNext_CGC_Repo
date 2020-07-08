import java.util.Random;
public class TestCompartment
{

   public static void main(String[] args)
   {
       Compartment[] c=new Compartment[10];
       Random r=new Random();
       
       for(int i=0;i<10;i++)
       {
           int n=r.nextInt(4)+1;
           switch(n)
           {
              case 1:   c[i]=new FirstClass();
                        System.out.println(c[i].notice());          
              break;
              case 2:   c[i]=new Ladies();
                        System.out.println(c[i].notice());
              break;
              case 3:   c[i]=new General();
                        System.out.println(c[i].notice());
              break;
              case 4:   c[i]=new Luggage();
                        System.out.println(c[i].notice());
              break;
           }
       }
   }
}

abstract class Compartment
{
   public abstract String notice();
}


class FirstClass extends Compartment
{
   public String notice()
  {
     return "This is FirstClass Compartment";
  }
}

class Ladies extends Compartment
{
   public String notice()
  {
     return "This is Ladies Compartment";
  }
}

class General extends Compartment
{
   public String notice()
  {
     return "This is General Compartment";
  }
}
class Luggage extends Compartment
{
   public String notice()
  {
     return "This is Luggage Compartment";
  }
}























