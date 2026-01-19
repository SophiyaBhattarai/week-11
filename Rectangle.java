package week11;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape implements Drawable
{
    double length;
    double width;
    
    public Rectangle(double length, double width)
    {
        this.length=length;
        this.width=width;
    }
    
    public double calculateArea()
    {
        return length*width;
    }
    
    public double calculatePerimeter()
    {
        double perimeter=2*(length+width);
        return perimeter;
    }
    
    public void draw()
    {
        System.out.println("Draw a Rectangle");
    }
}