package week11;


/**
 * Write a description of class Wheat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheat extends Crop implements Transportable
{
    public Wheat(double landArea)
    {
        super("Wheat","Winter",landArea);
    }
    
    public double calculateYield()
    {
        double yield=landArea*1.8;
        return yield;
    }
    
    public double calculateWaterRequirement()
    {
        double water=landArea*8000;
        return water;
    }
    
    public double calculateTransportCost()
    {
        double cost=landArea*2000;
        return cost;
    }
    
    public String getTransportMethod()
    {
        String method="Truck";
        return method;
    }
}