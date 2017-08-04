//Salleh Jahaf
//InchesToFeet.java

import java.util.Scanner;
class InchesToFeet
{
   public static void main(String[] args)
   {
      final int INCHES_IN_FOOT = 12;
      int inches;
      int feet;
      int inchesLeft;
      Scanner mine = new Scanner(System.in);
      System.out.print("Enter number of inches >>");
      inches = mine.nextInt();
      feet = inches / INCHES_IN_FOOT;
      inchesLeft = inches % INCHES_IN_FOOT;
      System.out.println(inches + " inches is " + feet + " feet and " + inchesLeft + " inches");
   }
}      