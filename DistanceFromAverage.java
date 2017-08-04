import java.util.*;
public class DistanceFromAverage
{
   public static void main(String[] args)
   {
      double[] userValues = new double[20];
      int entry;
      int x = 1;
      int y = 0;
      int total = 0;
      double average;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer or 99999 to quit >> ");
      entry = input.nextInt();
      if(entry == 99999)
         System.out.println("Please enter a value");
      while(entry != 99999 && x < userValues.length)
      {
         userValues[x] = entry;
         total = total + entry;
         System.out.print("Enter an integer or 99999 to quit >> ");
         entry = input.nextInt();
         if(entry == 99999)
            break;
         x++;
      }
      
      average = total / x;
      System.out.println("You entered " + x + " numbers and their average is " + average);
      for (y = 1; y < x; ++y)
      {
         System.out.println(userValues[y] + " is " + (userValues[y] - average) + " away from the average");
      }
   }
}            