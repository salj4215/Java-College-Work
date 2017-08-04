import javax.swing.*;
public class CountMovieSpaces2
{
   public static void main(String[] args)
   {
      String movieQuote;
      int stringLength, spaceCount = 0;
      int i;
      char c;
      movieQuote = JOptionPane.showInputDialog(null, "Please enter a quote from a movie");
      stringLength = movieQuote.length();
      for(i=0; i < stringLength; ++i)
      {
         if(movieQuote.charAt(i) == ' ')
         {
            spaceCount++;
         }
      }
      JOptionPane.showMessageDialog(null, "There are " + spaceCount + " spaces in your quote.");
   }
}            