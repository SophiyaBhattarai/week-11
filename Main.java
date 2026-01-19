package week11;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Shape s1=new Rectangle(5,3);
        Shape s2=new Circle(4);
        
        Shape[] s0={s1,s2};
        
        for(int i=0; i<s0.length;i++)
        {
            s0[i].displayShapeInfo();
            ((Drawable) s0[i]).draw();
            
            System.out.println("");
        }
    }
}