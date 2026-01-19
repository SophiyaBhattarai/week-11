package week11;


/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Circle extends Shape implements Drawable
{
    double radius;
    public Circle(double radius)
    {
        this.radius=radius;
    }
    
    public double calculateArea()
    {
        double area=Math.PI*radius*radius;
        return area;
    }
    
    public double calculatePerimeter()
    {
        double perimeter=2*Math.PI*radius;
        return perimeter;
    }
    
    public void draw()
    {
        System.out.println("Draw a Circle");
    }
}