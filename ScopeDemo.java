//Demonstrating that variable aNumber exists until the end of the method it 
//was declared in

public class ScopeDemo
{
   public static void main(String []args)
   {
      int aNumber = 10;
      System.out.println("In outer block number is " + aNumber + " another number is " + aNumber);
      {
         int anotherNumber = 512;
         System.out.println("In inner block number is " + aNumber + " another number is " + anotherNumber);
      }
      System.out.println("Back in out block the number is " + aNumber);
   }
}            