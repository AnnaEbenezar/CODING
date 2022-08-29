package colorchange;

import javax.swing.JFrame;

public class ColorChange 
{

    //-----------------------------------------------------------------
   //  Creates and displays the application frame.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Color Change");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      frame.getContentPane().add (new ColorChangePanel());
      frame.pack();
      frame.setVisible(true);
   }

    
}
