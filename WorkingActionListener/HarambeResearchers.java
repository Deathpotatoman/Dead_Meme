/*Harambe researchers:
This classes functions as a passive clicker that will add 1 dead meme to the total every seccond
Its initial cost will be 100 Dead Memes and will be subject to standard cost inflation.
This classes output can also be changed through upgrades avaialable in the upgrade section and will have its output changed
depending on what upgrades have been purchased
*/
//Import JButton
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//Extend to dead_meme class
public class HarambeResearchers extends TestUpper
{
    //Instance variables for HarambeResearchers button
    private JButton ClickerJButton;
    public HarambeResearchers()
    {
    //set up a button and add its charactoristics
    JButton button1 = new JButton();
    button1.setBounds(60,60,60,60);
    button1.setText("Harambe Researchers");
    button1.setPreferredSize(new Dimension (200,60));
    //add actionlistener to the button so that when clicked something will happen
    button1.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        // display/center the jdialog when the button is pressed
        JDialog d = new JDialog(MainJF, "OOF", true);
        d.setLocationRelativeTo(MainJF);
        d.setVisible(true);
      }
    });
        // add button to frame
        MainJP.add(button1);
        
    JButton button2 = new JButton();
    button2.setBounds(60,60,60,60);
    button2.setText("Harambe Upgrade");
    button2.setPreferredSize(new Dimension (200,60));
    //add actionlistener to the button so that when clicked something will happen
    button2.addActionListener(new ActionListener()
    {
      public void actionPerformed(ActionEvent e)
      {
        // display/center the jdialog when the button is pressed
        JDialog d = new JDialog(MainJF, "MY BONES", true);
        d.setLocationRelativeTo(MainJF);
        d.setVisible(true);
      }
    });
    
    // add button to frame
    MainJP.add(button2);
    
    }

}
