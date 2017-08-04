import javax.swing.JOptionPane;
public class MathFunctions
{
   public static void main(String[] args)
   {
      String numString;
      double num;
      
      numString = JOptionPane.showInputDialog(null, "Enter a number");
      num = Double.parseDouble(numString);
      JOptionPane.showMessageDialog(null, "The smallest whole number greater than that number is " + Math.floor(num) + ".");
      JOptionPane.showMessageDialog(null, "The largest whole number greater than that number is " + Math.ceil(num) + ".");
      JOptionPane.showMessageDialog(null, "The absolute value of that number is " + Math.abs(num) + ".");
   }
}      