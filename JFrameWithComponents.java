import javax.swing.*;
import java.awt.*;
public class JFrameWithComponents extends JFrame
{
   JLabel label = new JLabel("Enter your name");//Creating label
   JTextField field = new JTextField(12);//Creating a text box
   JButton button = new JButton("OK");//Creating a button
   public JFrameWithComponents()
   {
      super("Frame with Components"); //Calling parent class with Title as argument
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());//Creating the Flow Layout
      add(label);//Adding the label
      add(field); //Adding the text field
      add(button);//Adding the buuton
   }
}      