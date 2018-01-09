import math.java;
import javax.swing.*;
public class Dead_Meme extends JFrame
    {
    protected double multiplier;//this double is the multiplier for dead meme generators
    protected double create;//this double tracks how much each dead meme generates
    protected int total;//this tracks how many of each generator is
    protected double price;//tracks price of each generator
    void upgradePrice()
        {
        price=round(price*total*1.15);
        }
        
    }