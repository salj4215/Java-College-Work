import javax.swing.*;
import java.awt.*;
public class JFrameWithQuotes extends JFrame
{
   JLabel quote = new JLabel("Route 50 is considered “The Loneliest Highway” in America.");
   public JFrameWithQuotes()
   {
      super("Frame with Quote");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(new FlowLayout());
      add(quote);
   }
}      