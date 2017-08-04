public class Rectangle
{
   private double length;
   private double width;
   private double perimeter;
   private double area;
   private String shape;
   Rectangle()
   {
      length = 1;
      width = 1;
   }
   public void setLength(double ln)
   {
      length = ln;
   }
   public double getLength()
   {
      return length;
   }
   public void setWidth(double wd)
   {
      width = wd;
   }
   public double getWidth()
   {
      return width;
   }
   public double computePerimeter()
   {
      return 2 * length + 2 * width;
   }
   public double computeArea()
   {
      return length * width;
   }
   public String isSquare()
   {
      if(length == width)
         shape = "square";
      else
         shape = "rectangle";
      return shape;
   }
}            
                             