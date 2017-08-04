import javax.swing.JOptionPane;
public class AgeCheck
{
   public static void main(String[] args)
   {
      int age;
      String name;
      String ageString;
      
      name = JOptionPane.showInputDialog(null, "Enter your name");
      ageString = JOptionPane.showInputDialog(null, "Enter your age");
      age = Integer.parseInt(ageString);
      if (age > 20 && age < 41)
         JOptionPane.showMessageDialog(null, name);
   }
}         