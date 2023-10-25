package colorchange;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangePanel extends JPanel
{
   private Color shade;
   private int center;

   //-----------------------------------------------------------------
   //  Initializes the panel.
   //-----------------------------------------------------------------
   public ColorChangePanel()
   {
      addMouseMotionListener(new MoveListener());
      shade = Color.green;
      setBackground (shade);
      setPreferredSize (new Dimension(300, 300));
   }

   //-----------------------------------------------------------------
   //  Draws a center line and paints the rectangle in the current
   //  color.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent(page);
      setBackground(shade);

      center = getWidth() / 2;
      page.setColor (Color.white);
      page.drawLine (center, 0, center, getHeight());
   }

   //*****************************************************************
   //  Represents the listener for the mouse clicks.
   //*****************************************************************
   private class MoveListener extends MouseMotionAdapter
   {
      //-----------------------------------------------------------------
      //  Switches the color and repaints the applet if necessary based
      //  on the current mouse location.
      //-----------------------------------------------------------------
      public void mouseMoved (MouseEvent event)
      {
         Point location = event.getPoint();

         if (location.x < center)
         {
            if (shade.equals(Color.green))
            {
               shade = Color.red;
               repaint();
            }
         }
         else
            if (shade.equals(Color.red))
            {
               shade = Color.green;
               repaint();
            }
      }
   }
}
