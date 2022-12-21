/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dirumah.project10_19;

import java.util.Scanner;

/**
 *
 * @author Asid
 */
public class Project11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        String kalimat = scan.nextLine();
        int x = scan.nextInt();
        int y = scan.nextInt();
        System.out.println(kalimat.substring(x,y));
    }
    
}
