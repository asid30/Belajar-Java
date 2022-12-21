/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTP;
/**
 *
 * @author Praktikan
 */
public class UjianGuys {

    public static void main(String[] args) {
        Nilai nilai = new Nilai();
        nilai.setMataKuliah("PBO");
        nilai.setNilaiTugas(90);
        nilai.setNilaiUts(70);
        nilai.setNilaiUas(60);
        
        System.out.println(nilai.getMataKuliah());
        System.out.println(nilai.getNilaiTugas());
        System.out.println(nilai.getNilaiUas());
        System.out.println(nilai.getNilaiUas());
        System.out.println(nilai.getNilaiUts());
        
        Mahasiswa mhs = new Mahasiswa("Budi Gunawan", "2018051002", nilai);
        mhs.print();
    }
    
}
