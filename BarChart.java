import java.util.Scanner;
public class BarChart
{
   public static void main(String[] args)
   {
      int artPoints, bobPoints, calPoints, danPoints, eliPoints;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter points scored by Art >> ");
      artPoints = input.nextInt();
      System.out.print("Enter points scored by BOB >> ");
      bobPoints = input.nextInt();
      System.out.print("Enter points scored by Cal >> ");
      calPoints = input.nextInt();
      System.out.print("Enter points scored by Dan >> ");
      danPoints = input.nextInt();
      System.out.print("Enter points scored by Eli >> ");
      eliPoints = input.nextInt();
      System.out.println();
      System.out.println("Points for Game");
      System.out.println();
      System.out.print("Art   ");
      displayBar(artPoints);
      System.out.print("Bob   ");
      displayBar(bobPoints);
      System.out.print("Cal   ");
      displayBar(calPoints);
      System.out.print("Dan   ");
      displayBar(danPoints);
      System.out.print("Eli   ");
      displayBar(eliPoints);
      
   }
   public static void displayBar(int pp)
   {
      int points;
      for(points = 0; points < pp; ++points)
      {
         System.out.print("*");
      }
      System.out.println();
   }
}         
            