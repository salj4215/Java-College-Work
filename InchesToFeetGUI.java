//Salleh Jahaf
//InchesToFeetGUI.java

import javax.swing.JOptionPane;
public class InchesToFeetGUI
{
   public static void main(String[] args)
   {
      final int INCHES_IN_FOOT = 12;
      int inches;
      int feet;
      int inchesLeft;
      String inchesString;
      inchesString = JOptionPane.showInputDialog(null, "Enter number of inches", "Inch dialog", JOptionPane.INFORMATION_MESSAGE);
      
      inches = Integer.parseInt(inchesString);
      feet = inches / INCHES_IN_FOOT;
      inchesLeft = inches % INCHES_IN_FOOT;
      JOptionPane.showMessageDialog(null, inches + " inches is " + feet + " feet and " + inchesLeft + " inches");
   }
}      