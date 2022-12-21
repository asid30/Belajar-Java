
package Praktikum9;

public class Tabung {
    private static final double phi = Math.PI;
    
    public static double Volume(double r,double t){
        return phi*r*r*t;
    }
    public static double LuasPermukaan(double r, double t){
        return 2*phi*r*(r+t);
    }
}


