
/**
 * VectorNorm
 * 
 * Lily Barakat
 * @version (a version number or a date)
 */
public class VectorNorm
{
    public static void main (String arg[]) {
      double x=2;
      double y=3;
      double z=4;
      System.out.print(norm(x, y, z));
      
    }
    
    public static double norm(double x, double y, double z) {
       double v =  Math.sqrt(Math.pow(x, 2)+Math.pow(y, 2)+Math.pow(z, 2));
       return (Math.abs(v));
    }
}

