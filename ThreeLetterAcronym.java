import javax.swing.*;
public class ThreeLetterAcronym
{
   public static void main(String[] args)
   {
      String userString;
      int stringLength;
      char firstW = '9', secW = '9', thirdW = '9';
      int i;
      userString = JOptionPane.showInputDialog(null, "Please enter three words");
      stringLength = userString.length();
      
      for(i=0;i < stringLength; ++i)
      {
         if(i == 0)
         {
            firstW = userString.charAt(i);
            firstW = Character.toUpperCase(firstW);
         }
         if(userString.charAt(i) == ' ')
         {
            ++i;
            if(secW == '9')
            {
               secW = userString.charAt(i);
               secW = Character.toUpperCase(secW);
            }   
            else
            {
               thirdW = userString.charAt(i);
               thirdW = Character.toUpperCase(thirdW);
            }      
         }
         if(thirdW != '9')
            break;
      }
      JOptionPane.showMessageDialog(null, "Your acronym is " + firstW + secW + thirdW);
   }
}                   