/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dirumah.project1;

import java.util.Scanner;

/**
 *
 * @author Asid
 */
public class Project7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        System.out.print("Masukan jumlah index array: ");
        int n = input.nextInt();
        int[] arr = new int[n];
        boolean kondisi = false;
        
        for(int i=0;i<n;i++){
            System.out.print("Masukan nilai index ke-"+i+": ");
            arr[i] = input.nextInt();
        }
        System.out.print("Array: ");
        for(int print:arr){
            System.out.print(print+" ");
        }
        System.out.println();
        System.out.print("Masukan nilai yang ingin dicari: ");
        int mencari = input.nextInt();
        
        for(int j=0;j<n;j++){
            if (mencari == arr[j]){
                System.out.println("Nilai ditemukan pada index ke-"+j);
                kondisi = true;
                break;
            }
        }
        if (kondisi == false){
            System.out.println("Nilai tidak ditemukan");
        }
    }
    
}
