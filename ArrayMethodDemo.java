import java.util.*;
public class ArrayMethodDemo
{
   public static void main(String[] args)
   {
      int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7, 13, 50};
      int ceilingValue;
      
      display(numbers);
      System.out.println();
      reverse(numbers);
      System.out.println();
      sum(numbers);
      System.out.println();
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a ceiling value >> ");
      ceilingValue = input.nextInt();
      lessThan(numbers, ceilingValue);
      System.out.println();
      greaterThanAverage(numbers);
   }
   
   public static void display(int[] arr)
   {
      int x;
      System.out.print("The numbers in the array are:");
      for(x = 0; x < arr.length; ++x)
         System.out.print(" " + arr[x]);
   }
   
   public static void reverse(int[] arr)
   {
      int x;
      System.out.print("The numbers in the array in reverse order are:");
      for(x = 9; x >= 0; --x)
         System.out.print(" " + arr[x]);
   }
   
   public static void sum(int[] arr)
   {
      int x;
      int sum = 0;
      System.out.print("The total sum of the numbers in the array is ");
      for(x = 0; x < arr.length; ++x)
         sum = sum + arr[x];
      System.out.print(sum);
   }
   
   public static void lessThan(int[] arr, int cv)
   {
      int x;
      System.out.print("All numbers in the array that are less than " + cv + " are: ");
      for(x = 0; x < arr.length; ++x)
      {
         if(arr[x] < cv)
            System.out.print(" " + arr[x]);
      } 
   }
   
   public static void greaterThanAverage(int[] arr)
   {
      int x, sum = 0;
      double avg;
      for(x = 0; x < arr.length; ++x)
        sum = sum + arr[x];
      avg = sum / 10;
      System.out.println("The average of the numbers in the array is " + avg);
      System.out.print("All numbers in the array that are greather than the average of the numbers is ");
      for(x = 0; x < arr.length; ++x)
      {
         if(arr[x] > avg)
            System.out.print(" " + arr[x]);
      }
   }                                    
}         
      