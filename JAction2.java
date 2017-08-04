import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JAction2 extends JFrame implements ActionListener
{
   JLabel label = new JLabel("Enter your name");//Creating label
   JTextField field = new JTextField(12);//Creating a text box
   JButton button = new JButton("OK");//Creating a button
   public JAction2()
   {
      super("Action2"); //Calling parent class with Title as argument
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
      Object source = e.getSource();
      if(source == button)
         label.setText("You clicked the button");
      else
         label.setText("You pressed Enter");   
   }
   public static void main(String[] args)
   {
      JAction2 aFrame = new JAction2();
      final int WIDTH = 250;
      final int HEIGHT = 100;
      aFrame.setSize(WIDTH, HEIGHT);
      aFrame.setVisible(true);
   }      
}      