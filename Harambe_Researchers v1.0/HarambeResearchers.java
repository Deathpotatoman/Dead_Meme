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
public class HarambeResearchers extends Dead_Meme
{
    //Instance variables for HarambeResearchers
    private JButton ClickerJButton;
    private static final long serialVersionUID = 1L;
    
    public HarambeResearchers()
    {
        this.getContentPane().setLayout(new FlowLayout());
        JButton button1 = new JButton();
        button1.setText("Harambe Researchers");
        JButton button2 = new JButton("I'm a scientist!");
        // add buttons to frame
        add(button1);
        add(button2);
    }
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new HarambeResearchers();
        //Display the window.
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
