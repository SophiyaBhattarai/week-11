package week11;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Transportable
{
    public Rice(double landArea)
    {
        super("Rice","Monsoon",landArea);
    }
    
    public double calculateYield()
    {
        double yield=landArea*4.2;
        return yield;
    }
    
    public double calculateWaterRequirement()
    {
        double water=landArea*13000;
        return water;
    }
    
    public double calculateTransportCost()
    {
        double cost=landArea*1600;
        return cost;
    }
    
    public String getTransportMethod()
    {
        String method="Truck";
        return method;
    }
}