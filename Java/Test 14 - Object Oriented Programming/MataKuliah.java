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
public class MataKuliah {
    private String nama;
    private int sks;
    private String dosen;
    
    public void ShowDetail(){
        System.out.println("Nama Mata Kuliah    = "+nama);
        System.out.println("Jumlah SKS          = "+sks);
        System.out.println("Nama dosen pengajar = "+dosen);
    }
    
    public void ubahNama(String nama){
        this.nama = nama;
    }
    
    public void ubahSKS(int sks){
        this.sks = sks;
    }
    
    public void ubahDosen(String dosen){
        this.dosen = dosen;
    }
    
    public void insertData(String nama, int sks, String dosen){
        this.nama = nama;
        this.sks = sks;
        this.dosen = dosen;
    }
}
