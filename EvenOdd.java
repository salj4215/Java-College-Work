import java.util.Scanner;
public class EvenOdd
{
   public static void main(String[] args)
   {
      int num, result;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number >>");
      num = input.nextInt();
      result = num % 2;
      if (result == 0)
         System.out.print("The number is even");
      else
         System.out.print("The number is odd");
   }
}            