import java.util.Scanner;
public class TwelveDays
{
   public static void main(String[] args)
   {
      int day;
      
      Scanner input = new Scanner(System.in);
      System.out.println("Enter an integer... ");
      day = input.nextInt();
      
      switch(day)
      {
         case(12):
           if (day == 12)
            {
               System.out.println("On the twelth day of Christmas");
               System.out.println("my true love sent to me:");
            }   
            System.out.println("12 Drummers Drumming");
         case(11):
            if (day == 11)
            {
               System.out.println("On the eleventh day of Christmas");
               System.out.println("my true love sent to me:");
            }
            System.out.println("11 Pipers Piping");
         case(10):
            if (day == 10)
            {
               System.out.println("On the tenth day of Christmas");
               System.out.println("my true love sent to me:");
            }         
            System.out.println("10 Lords a Leaping");
         case(9):
            if (day == 9)
            {
               System.out.println("On the ninth day of Christmas");
               System.out.println("my true love sent to me:");
            }
            System.out.println("9 Ladies Dancing");
         case(8):
            if (day == 8)
            {
               System.out.println("On the eighth day of Christmas");
               System.out.println("my true love sent to me:");
            }  
            System.out.println("8 Maids a Milking");
         case(7):
            if (day == 7)
            {
               System.out.println("On the seventh day of Christmas");
               System.out.println("my true love sent to me:");
            }     
            System.out.println("7 Swans a Swimming");
         case(6):
            if (day == 6)
            {
               System.out.println("On the sixth day of Christmas");
               System.out.println("my true love sent to me:");
            }
            System.out.println("6 Geese a Laying");
         case(5):
            if (day == 5)
            {
               System.out.println("On the fifth day of Christmas");
               System.out.println("my true love sent to me:");
            }
            System.out.println("5 Golden Rings");
         case(4):
            if (day == 4)
            {
               System.out.println("On the fourth day of Christmas");
               System.out.println("my true love sent to me:");
            }
            System.out.println("4 Calling Birds");
         case(3):
            if (day == 3)
            {
               System.out.println("On the third day of Christmas");
               System.out.println("my true love sent to me:");
            }   
            System.out.println("3 French Hens");
         case(2):
            if (day == 2)
            {
               System.out.println("On the second day of Christmas");
               System.out.println("my true love sent to me:");
            }
            System.out.println("2 Turtle Doves");
            System.out.println("And ");
         case(1):
            if (day == 1)
            {
               System.out.println("On the first day of Christmas");
               System.out.println("my true love sent to me:");
            }
            System.out.print("A Partridge in a Pear Tree");
            break;
         default:
            System.out.println("Not a valid day");
      }
   }
}                                