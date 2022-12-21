/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abdilahasyidiqi_praktikum6;

/**
 *
 * @author Praktikan
 */
public class Mahasiswa {
    public String nama;
    public String npm;
    private double nilaiUAS;
    private double nilaiUTS;
    
    public void setNilaiUAS(double nilai){
        nilaiUAS = nilai;
    }
    public void setNilaiUTS(double nilai){
        nilaiUTS = nilai;
    }
    public void cetakNilai(){
        System.out.println("Nama        = "+nama);
        System.out.println("NPM         = "+npm);
        System.out.println("Nilai UAS   = "+nilaiUAS);
        System.out.println("Nilai UTS   = "+nilaiUTS);
        System.out.println("Nilai akhir = "+nilaiAkhir());
    }
    public double nilaiAkhir(){
        double jumlah = nilaiUAS + nilaiUTS;
        double rata_rata = jumlah/2;
        return rata_rata;
    }
}
