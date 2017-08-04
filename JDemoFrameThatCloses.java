import javax.swing.*;
public class JDemoFrameThatCloses
{
   public static void main(String[] args)
   {
      //Declaring a JFrame object named aFrame
      //Using the String argument to set the title
      JFrame aFrame = new JFrame("This is a frame");
      final int WIDTH = 250; //Setting the width of aFrame to a variable
      final int HEIGHT = 250; //Setting the height of aFrame to a variable
      aFrame.setSize(WIDTH, HEIGHT); //Setting the width and height to aFrame
      aFrame.setVisible(true);//Making aFrame visible
      //Allowing aFrame to close
      aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
}      