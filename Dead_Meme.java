import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Dead_Meme extends JFrame //implements ActionListener
    {
    private final long serialVersionUID = 1L;
    protected JFrame MainJF;
    protected JPanel MainJP;
    Container contentPane;
    protected String name;
    protected double multiplier;//this double is the multiplier for dead meme generators
    protected double create;//this double tracks how much each dead meme generates
    protected int total;//this tracks how many of each generator is
    protected double price;//tracks price of each generator
    void upgradePrice()//this method is called upon when more units are purchased to change the price of the next one purchased
        {
        price=Math.round(price*total*1.15);
        }
    double Purchase(double a)//main purchase command increases units by 1 if we enough of whatever is sent
        {    
        if (a >=price)
            {
            a-=price;
            total+=1;
            upgradePrice();
            }
        return a; 
        }
    double Purchase10(double a)//same things as purchase for 10 units
        {
        if  (a >=Math.round(price*20.303718238))
            {
            a-=Math.round(price*20.303718238);
            total+=10;
            upgradePrice();
            }
        return a; 
        }    
    double Purchase100(double a)//same things for 100 units
        {
        if (a >=price*7878749.671335188)    
            {
            a-=price*7878749.671335188;
            total+=100;
            upgradePrice();
            }
        return a; 
        }    
    double MaxPurchase(double a)//uses recursion to buy units until we cannot afford anymore
        {
        if(a>=price)
            {
            MaxPurchase(a-price);
            total+=1;
            upgradePrice();
            MaxPurchase(a);
            }
        else
            {
            return a;
            }
        return a;    
        }
    String ToString()
        {
            return "You have "+ Math.round(total) + " "+name + " creating " + Math.round(create)+ " per second";
        }
    public Dead_Meme()
   {   
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() 
        {
            public void run() {
                createAndShowGUI();
            }
        });
    }
   private void createAndShowGUI() {
      
      
       MainJP = new JPanel();
       setSize(1600,1000);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       add(MainJP);
      // contentPane.add(MainJP);
       setVisible(true);
    }    
       
    }