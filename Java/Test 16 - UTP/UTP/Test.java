/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTP;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
        
        int x = scan.nextInt();
        int y = scan.nextInt();
        
        double hasil = (x*x)*y/3;
        
        System.out.println(String.format("%.2f", hasil));
    }
    
}
