import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//test to see how HarabmeResearchers or any other passive click can add buttons
//to a seperate JFrame
public class TestUpper extends JFrame
{
   private final long serialVersionUID = 1L;
   protected JFrame MainJF;
   protected JPanel MainJP;
   public TestUpper()
   {   
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() {
                RunAndShowFrame();
            }
        });
    }
   private  void RunAndShowFrame() {
       MainJP = new JPanel();
       setSize(1600,1000);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(MainJP);
       setVisible(true);
    }
}

