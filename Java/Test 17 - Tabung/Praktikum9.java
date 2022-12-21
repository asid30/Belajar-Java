package Praktikum9;

//import static Praktikum9.Tabung.LuasPermukaan;
//import static Praktikum9.Tabung.Volume;

public class Praktikum9 {
    //atribut static dan bukan static
    public String atributBukanStatic = "Atribut Bukan Static";
    static String atributStatic = "Atribut Static";
    
    //method static dan bukan static
    public void bukanStatic(){
        System.out.println("Bukan Static");
    }
    public static void methodStatic(){
        System.out.println("Method Static");
    }
    
    //nested class
    public static class Tabung {
        private static final double phi = Math.PI;

        public static double Volume(double r,double t){
            return phi*r*r*t;
        }
        public static double LuasPermukaan(double r, double t){
            return 2*phi*r*(r+t);
        }
    }
    
    //class utama
    public static void main(String[] args) {
        //objectt untuk memanggil atribut bukan static dan non-static
        Praktikum9 test = new Praktikum9();
        
        System.out.println(test.atributBukanStatic);
        System.out.println(atributStatic);
        
        test.bukanStatic();
        methodStatic();
        
        System.out.println();
        
        System.out.println(String.format("%.5f", Tabung.LuasPermukaan(13,30)));
        System.out.println(String.format("%.5f", Tabung.Volume(13,30)));
        
    }
    
}
