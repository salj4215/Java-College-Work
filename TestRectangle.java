public class TestRectangle
{
   public static void main(String[] args)
   {
      Rectangle a = new Rectangle();
      Rectangle b = new Rectangle();
      String shapeA;
      String shapeB;
      
      a.setLength(2);
      a.setWidth(2);
      b.setLength(3);
      b.setWidth(6);
      shapeA = a.isSquare();
      shapeB = b.isSquare();
      
      System.out.println("The perimeter of a is " + a.computePerimeter());
      System.out.println("The area of a is " + a.computeArea());
      System.out.println("A is a " + shapeA);
      System.out.println("The perimeter of b is " + b.computePerimeter());
      System.out.println("The area of a is " + b.computeArea());
      System.out.println("B is a " + shapeB);
   }
}       