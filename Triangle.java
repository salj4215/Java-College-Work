//Salleh Jahaf MidTerm
public class Triangle
{
   private double sideA;
   private double sideB;
   private double sideC;
   Triangle()
   {
      sideA = 2;
      sideB = 2;
      sideC = 2;
   }
   public void setSideA(double lnA)
   {
      sideA = lnA;
   }
   public double getSideA()
   {
      return sideA;
   }
   public void setSideB(double lnB)
   {
      sideB = lnB;
   }
   public double getSideB()
   {
      return sideB;
   }
   public void setSideC(double lnC)
   {
      sideC = lnC;
   }
   public double getSideC()
   {
      return sideC;
   }
   public double computePerimeter()
   {
      return sideA + sideB + sideC;
   }
   public void displayData()
   {
      System.out.print("Sides " + sideA + ", " + sideB + ", " + sideC);
   }
}                                 