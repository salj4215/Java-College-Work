import java.util.Scanner;
public class SumPositive
{
   public static void main(String[] args)
   {
      double num;
      int x;
      double total = 0;
      
      Scanner input = new Scanner(System.in);
      for (x = 1; x < 11; ++x)
      {
         System.out.print("Enter a number >> ");
         num = input.nextDouble();
         if (num > 0)
            total += num;
      }
      System.out.println("The total of all the positive numbers you entered is " + total);
   }
}            