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
public class Project10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        String[] kata = new String[n];
        String tampung = "";
        
        for(int i=0;i<kata.length;i++){
            kata[i] = input.next();
        }
        
        for (String kata1 : kata) {
            tampung = tampung.concat(kata1 + " ");
        }

        System.out.println(tampung);
    }
    
}
