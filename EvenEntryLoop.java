import java.util.Scanner;
public class EvenEntryLoop
{
   public static void main(String[] args)
   {
      int num;
      int result;
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter an even number or 999 to exit... ");
      num = input.nextInt();
      result = num % 2;
      while(num != 999)
      {
         while(result != 0)
         {
            System.out.println("You did not enter an even number.");
            System.out.print("Please enter an even number... ");
            num = input.nextInt();
            result = num % 2;
         }   
            System.out.println("Good job!");
            System.out.print("Please enter an even number or 999 to exit... ");
            num = input.nextInt();
            result = num % 2;
      }
   }
}            
          