import java.awt.*;
import javax.swing.*;
public class Dead_Meme extends JFrame
    {
    protected double multiplier;//this double is the multiplier for dead meme generators
    protected double create;//this double tracks how much each dead meme generates
    protected int total;//this tracks how many of each generator is
    protected double price;//tracks price of each generator
    void upgradePrice()
        {
        price=Math.round(price*total*1.15);
        }
    double Purchase(double a)
        {    
        if (a >=price)
            {
            a-=price;
            total+=1;
            upgradePrice();
            }
        return a; 
        }
    double Purchase10(double a)
        {
        if  (a >=Math.round(price*20.303718238))
            {
            a-=Math.round(price*20.303718238);
            total+=10;
            upgradePrice();
            }
        return a; 
        }    
    double Purchase100(double a)
        {
        if (a >=Math.round(price*7878749.671335188))    
            {
            a-=Math.round(price*7878749.671335188);
            total+=100;
            upgradePrice();
            }
        return a; 
        }    
    double MaxPurchase(double a)
        {
        if(a>=price)
            {
            total+=1;
            upgradePrice();
            MaxPurchase(a-price);
            }
        else
            {
            return a;
            }
        return a;    
        }
    }