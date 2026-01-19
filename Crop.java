package week11;


/**
 * Write a description of class Crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Crop
{
    protected String cropName;
    protected String season;
    protected double landArea;
    
    public Crop(String cropName, String season, double landArea)
    {
        this.cropName=cropName;
        this.season=season;
        this.landArea=landArea;
    }
    
    public abstract double calculateYield();
    public abstract double calculateWaterRequirement();
    public void displayCropInfo()
    {
        double yield=calculateYield();
        double water=calculateWaterRequirement();
        
        System.out.println("Crop:"+cropName);
        System.out.println("Season:"+season);
        System.out.println("LandArea:"+landArea+"Total");
        System.out.println("Estimated Yield:"+yield);
        System.out.println("Water requirement:"+water);
    }
}