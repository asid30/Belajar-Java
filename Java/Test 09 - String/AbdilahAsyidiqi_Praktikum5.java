/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praktikan
 */
public class AbdilahAsyidiqi_Praktikum5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String firstname = "Abdilah";
        String lastname = "Asyidiqi";
        
        String fullname = "Abdilah" + " " + "Asyidiqi";
        String fullname2 = firstname + " " + lastname;
        
        String upper = fullname2.toLowerCase();
        String lower = fullname2.toUpperCase();
        
        int panjang = fullname2.length();
        
        System.out.println(firstname);
        System.out.println(lastname);
        System.out.println(fullname);
        System.out.println(fullname2);
        System.out.println();
        
        System.out.println(upper);
        System.out.println(lower);
        System.out.println();
        
        System.out.println(panjang);
        System.out.println();
        
        System.out.println(fullname.substring(0, 7));
        System.out.println(fullname2.substring(8,16));
        System.out.println();
        
        int idx = fullname.indexOf("dilah");
        System.out.println(idx);
        System.out.println();
        
        boolean kondisi = fullname2.contains("Asyid");
        boolean kondisi2 = fullname2.equals("abdilah asyidiqi");
        boolean kondisi3 = fullname2.equals("Abdilah Asyidiqi");
        
        System.out.println(fullname2.contains("Abdi"));
        System.out.println(kondisi);
        System.out.println(kondisi2);
        System.out.println(kondisi3);
        System.out.println();
    }
    
}
