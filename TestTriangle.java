import java.util.Scanner;
public class TestTriangle
{
   public static void main(String[] args)
   {
      Triangle a = new Triangle();
      Triangle b = new Triangle();
      Triangle c = new Triangle();
      Triangle d = new Triangle();
      
      int side1, side2, side3;
      boolean trueTriangle;
      
      
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a length for side 1 >> ");
      side1 = input.nextInt();
      System.out.print("Enter a length for side 2 >> ");
      side2 = input.nextInt();
      System.out.print("Enter a length for side 3 >> ");
      side3 = input.nextInt();
      
      a.setSideA(side1);
      a.setSideB(side2);
      a.setSideC(side3);
      a.displayData();
      trueTriangle = TriangleTypes(a);
      if(trueTriangle == true)
         isRightTriangle(a);  
      
      
      System.out.print("Enter a length for side 1 >> ");
      side1 = input.nextInt();
      System.out.print("Enter a length for side 2 >> ");
      side2 = input.nextInt();
      System.out.print("Enter a length for side 3 >> ");
      side3 = input.nextInt();
      
      b.setSideA(side1);
      b.setSideB(side2);
      b.setSideC(side3);
      b.displayData();
      trueTriangle = TriangleTypes(b);
      if(trueTriangle == true)
         isRightTriangle(b);   
      
      
      System.out.print("Enter a length for side 1 >> ");
      side1 = input.nextInt();
      System.out.print("Enter a length for side 2 >> ");
      side2 = input.nextInt();
      System.out.print("Enter a length for side 3 >> ");
      side3 = input.nextInt();
      
      c.setSideA(side1);
      c.setSideB(side2);
      c.setSideC(side3);
      c.displayData();
      trueTriangle = TriangleTypes(c);
      if(trueTriangle == true)
         isRightTriangle(c);
      
      
      System.out.print("Enter a length for side 1 >> ");
      side1 = input.nextInt();
      System.out.print("Enter a length for side 2 >> ");
      side2 = input.nextInt();
      System.out.print("Enter a length for side 3 >> ");
      side3 = input.nextInt();
      
      d.setSideA(side1);
      d.setSideB(side2);
      d.setSideC(side3);
      d.displayData();
      trueTriangle = TriangleTypes(d);
      if(trueTriangle == true)
         isRightTriangle(d);
      
   }
   public static boolean TriangleTypes(Triangle t)
   {
      double a, b, c;
      boolean triangle;
      a = t.getSideA();
      b = t.getSideB();
      c = t.getSideC();
      
      if((a + b > c) && (b + c > a) && (a + c > b))
      {
         if((a == c) && (a == b))
            System.out.println(" You have formed an equilateral triangle.");
         else if((a == b) || (a == c))
            System.out.println(" You have formed an isosceles triangle.");
         else
            System.out.println(" You have formed a scalene triangle.");
         System.out.println("The perimeter of this triangle is " + t.computePerimeter());
         triangle = true;         
      }
      else
      {
         System.out.println(" You have not formed a triangle");
         triangle = false;
      }
      return triangle;            
   }
   public static void isRightTriangle(Triangle t)
   {
      double a, b, c;
      a = t.getSideA();
      b = t.getSideB();
      c = t.getSideC();
      
      if(((c * c) == ((a * a) + (b * b))))
         System.out.println("This triangle forms a Right Triangle.");
      else
         System.out.println("This triangle does not form a Right Triangle.");
   }         
}         
      