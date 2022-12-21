
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Praktikan
 */
public class AbdilahAsyidiqi_Praktikum4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nomor = {1, 3, 5, 7, 9};
        
        for(int i = 0; i < nomor.length; i++){
            System.out.print(nomor[i]+" ");
        }
        
        for(int num:nomor){
            System.out.print(num+" ");
        }
        
        System.out.println();
        
        Scanner input = new Scanner(System.in);
        
        int[] nilai = new int[3];
        System.out.println("Nilai matematematika : ");
        nilai[0] = input.nextInt();
        System.out.println("Nilai logika : ");
        nilai[1] = input.nextInt();
        System.out.println("Nilai bahasa : ");
        nilai[2] = input.nextInt();
        
        System.out.println();
        
        for(int print:nilai){
            System.out.print(print + " ");
        }
        
        nilai[1]= 86;
        
        System.out.println();
        
        for (int print:nilai){
            System.out.print(print + " ");
        }
        
        System.out.println();
        System.out.println();
        
        int[][] nilai2 = {{81,82,83},{76,77,78},{91,92,93}};
        
        for(int m = 0; m < nilai2.length; m++){
            System.out.println();
            for(int n = 0; n < nilai2.length; n++){
                System.out.println(nilai2[m][n]+" ");
            }
        }
    }
}
