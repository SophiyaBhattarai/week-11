package week11;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop implements Transportable
{
    public Maize(double landArea)
    {
        super("Maize","Summer",landArea);
    }
    
    public double calculateYield()
    {
        double yield=landArea*3.2;
        return yield;
    }
    
    public double calculateWaterRequirement()
    {
        double water=landArea*6000;
        return water;
    }
    
    public double calculateTransportCost()
    {
        double cost=landArea*700;
        return cost;
    }
    
    public String getTransportMethod()
    {
        String method="Vehicle";
        return method;
    }
}