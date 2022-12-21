/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package dirumah.project1;

/**
 *
 * @author Abdillah Asyidiqi
 */
public class Project1 {

    public static void main(String[] args) {
        //output
        System.out.println("Program tipe data dan cara melakukan output pada");
        System.out.println("Tipe data tertentu serta promotion dan casting");
        System.out.println("Pada tipe data tertentu");
        System.out.println("");
        
        //variabel tipe data number
        int angka = 55;
        long angkaLong = 3921;
        float angkaFloat = 0.25f;
        double angkaDouble = 7.54312;
        
        //variabel tipe data char dan kata
        char karakter = 'D';
        String kata = "Ilmu Komputer";
        
        //variabel tipe data boolean
        boolean kondisi1 = true;
        boolean kondisi2 = false;
        
        //casting dan promosi
        int fromDouble = (int) angkaDouble;
        double fromInt = angka;
        
        //output
        System.out.println(angka+"(integer)");
        System.out.println(angkaLong+"(long)");
        System.out.println(angkaFloat+"(float)");
        System.out.println(angkaDouble+"(double)");
        System.out.println("");
        
        //output
        System.out.println(karakter+"(char)");
        System.out.println(kata+"(String)");
        System.out.println("");
        
        //output
        System.out.println(kondisi1+"(boolean)");
        System.out.println(kondisi2+"(boolean)");
        System.out.println("");
        
        //output
        System.out.println("Casting dan Promosi");
        System.out.println("Casting double ke int   : "+fromDouble+" (Sebelumnya : "+angkaDouble+")");
        System.out.println("Promotion int ke double : "+fromInt+" (Sebelumnya : "+angka+")");
    }
}
