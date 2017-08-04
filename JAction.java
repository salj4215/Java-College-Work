import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JAction extends JFrame implements ActionListener
{
   JLabel label = new JLabel("Enter your name");//Creating label
   JTextField field = new JTextField(12);//Creating a text box
   JButton button = new JButton("OK");//Creating a button
   public JAction()
   {
      super("Action"); //Calling parent class with Title as argument
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());//Creating the Flow Layout
      add(label);//Adding the label
      add(field); //Adding the text field
      add(button);//Adding the buuton
      button.addActionListener(this);
      field.addActionListener(this);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      label.setText("Thank you");
      button.setText("Done");
   }
   public static void main(String[] args)
   {
      JAction aFrame = new JAction();
      final int WIDTH = 250;
      final int HEIGHT = 100;
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);
   }      
}      