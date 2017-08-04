import javax.swing.JOptionPane;
public class AgeCheck2
{
   public static void main(String[] args)
   {
      int age, choice = 1;
      String name;
      String ageString;
      String choiceString;
      
      while (choice == 1)
      {
         name = JOptionPane.showInputDialog(null, "Enter your name");
         ageString = JOptionPane.showInputDialog(null, "Enter your age");
         age = Integer.parseInt(ageString);
         if (age > 20 && age < 41)
            JOptionPane.showMessageDialog(null, name);
         choiceString = JOptionPane.showInputDialog(null, "Do you want to enter another name and age? 1 - Yes 2 - No");
         choice = Integer.parseInt(choiceString);    
      }      
   }
}         