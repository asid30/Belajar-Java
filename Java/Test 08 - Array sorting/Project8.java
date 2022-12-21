/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dirumah.project1;

import java.util.Arrays;
import java.util.Scanner;

public class Project8 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        int n = input.nextInt();
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++){
            arr[i] = input.nextInt();
        }
        
        Arrays.sort(arr);
        
        for(int print:arr){
            System.out.print(print+" ");
        }
    }
}
