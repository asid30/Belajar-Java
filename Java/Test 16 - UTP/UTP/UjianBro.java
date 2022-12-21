package UTP;

import java.util.Scanner;

public class UjianBro {

    public static void main(String[] args) {
        // TODO code application logic here
         
        Scanner scan = new Scanner (System.in);
        double jarak = scan.nextDouble();
        double waktu = scan.nextDouble();
        
        double kecepatan = (jarak/1000)/waktu;
        
        if (kecepatan > 80){
            System.out.println(String.format("%.2f", kecepatan));
            System.out.println("Cepat");
        }
        else if (kecepatan > 40 && kecepatan <= 80){
            System.out.println(String.format("%.2f", kecepatan));
            System.out.println("Normal");
        }
        else{
            System.out.println(String.format("%.2f", kecepatan));
            System.out.println("Lambat");
        }
    }
    
}
