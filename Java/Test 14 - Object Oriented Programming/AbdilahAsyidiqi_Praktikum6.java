package abdilahasyidiqi_praktikum6;

import java.util.Scanner;

public class AbdilahAsyidiqi_Praktikum6 {

    public static void main(String[] args) {
        Mahasiswa mantap = new Mahasiswa();
        MataKuliah keren = new MataKuliah();
        Scanner scan = new Scanner (System.in);
        
        mantap.nama = "Abdilah Asyidiqi";
        mantap.npm = "2117051001";
        
//        System.out.println("Nama : "+mantap.nama);
//        System.out.println("NPM  : "+mantap.npm);
        System.out.println();
        
        mantap.setNilaiUAS(95);
        mantap.setNilaiUTS(96);
        
        mantap.cetakNilai();
        
        System.out.println();
        System.out.print("Input Mata Kuliah = ");
        String namaMataKuliah = scan.nextLine();
        
        System.out.print("Input Jumlah SKS  = ");
        int jumlahSKS = scan.nextInt();
        
        scan.nextLine();
        System.out.print("Input Dosen       = ");
        String namaDosen = scan.nextLine();
        
        keren.insertData(namaMataKuliah,jumlahSKS,namaDosen);
        
        System.out.println();
        keren.ShowDetail();
    }
    
}
