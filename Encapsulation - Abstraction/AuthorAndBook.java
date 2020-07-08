public class AuthorAndBook
{
 public static void main(String[] args)
 {
    Book b=new Book("William","gouravgarg1232@gmail.com",'M',"Chemistry",547.50,5);
    System.out.println(b);

 }
}

class Author
{
   String name,email;
   char gender;
   
   public Author(String name,String email,char gender)
   {
      this.name=name;
      this.email=email;
      this.gender=gender;
   }
}

class Book
{
   String name;
   Author a;
   Double price;
   int qtyInStock;

   public Book(String authorname,String email,char gender,String bkname,Double price,int qtyInStock)
   {
     name=bkname;
     this.price=price;
     this.qtyInStock=qtyInStock;
     a=new Author(authorname,email,gender);
   }
   public String toString()
   {
        return name+"  "+a.name+"   "+a.email+"    "+a.gender+"     "+price+"    "+qtyInStock;
   }

}