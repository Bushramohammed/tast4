import java.awt.*;
import java.awt.event.*;
import javax.swing.JPanel;

public class Trafficlight extends JPanel{
    //int that holds count
    private int count;
    //hold push in Jbutton
    private JButton push;
    public Trafficlight()
    {
//The first click will be equal to one
        count = 0;
        push = new JButton ("Push");
        push.addActionListener(new ButtonListener());

        add(push);

        setPreferredSize (new Dimension(300,300));
    }
    public void paintComponent(Graphics page)
    {
//Constructor: Creates three circle objects
        super.paintComponent(page);
        page.setColor(Color.yellow);
        page.fillRect(100,100,100,100);
        page.setColor(Color.black);
        page.fillOval(100, 100, 100, 100);
        page.fillOval(100, 100, 100, 100);
        page.fillOval(100, 100, 100, 100);
        page.setColor(Color.white);
        page.fillOval(100, 100, 100,100);
        page.fillOval(100, 100, 100,100);
        page.fillOval(100, 100, 100,100);
//Draws lights that fit in the circles
//If the button is clicked once the green light will display
        if (count == 1)
        {
            page.setColor(Color.green);
            page.fillOval(100, 100, 100,100);
        }
//If the button is clicked twice the yellow light will display
        if (count == 2)
        {
            page.setColor(Color.yellow);
            page.fillOval(100, 100, 100,100);
        }
//If the button is clicked three times the red light will display
        if (count == 3)
        {
            page.setColor(Color.red);
            page.fillOval(100, 100, 100,100);
            count=0;
        }
//Represents a listener for button psuh (action) events.
        private class ButtonListener implements ActionListener
        {
            //Updates tje consturctor when button is pushed
            public void actionPerformed(ActionEvent event)
            {
                count ++;
                repaint();
            }
        }//end
    }

}
