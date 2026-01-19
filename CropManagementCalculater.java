package week11;


/**
 * Write a description of class CropManagementCalculater here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CropManagementCalculater
{
    public static void main(String[] args)
    {
        Crop[] c1={new Rice(2.3), new Wheat(5.5), new Maize(7.8)
        };
        
        for(int i=0;i<c1.length;i++)
        {
            c1[i].displayCropInfo();
            Transportable t=(Transportable) c1[i];
            System.out.println("Transport Method:"+t.getTransportMethod());
            System.out.println("Transport Cost:"+t.calculateTransportCost());
            System.out.println("");
        }
    }
}