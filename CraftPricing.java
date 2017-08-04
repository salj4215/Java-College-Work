//Salleh Jahaf
import java.util.Scanner;
class CraftPricing
{
   public static void main (String[] args)
   {
      String product;
      double materials;
      double hours;
      double price;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter product description >> ");
      product = input.nextLine();
      System.out.print("Enter cost of materials >> ");
      materials = input.nextDouble();
      System.out.print("Enter hours of work >> ");
      hours = input.nextDouble();
       //Note: when returning a value it must go into a variable
       //Therefore variable = methodCall(agrs, args)
       
       price = computePrice(materials, hours);
       System.out.println("The 