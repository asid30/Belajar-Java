package Praktikum10;

public class ProgramUtama {

    public static void main(String[] args) {
        BangunDatar bd = new BangunDatar("Hitam");
        System.out.println("Warna bangun datar: " + bd.getWarna());
        System.out.println();
        
        BangunDatar ling = new Lingkaran (26.0,"Merah");
        System.out.println("Warna Lingkaran: " + ling.getWarna());
        System.out.println("Luas Lingkaran: " + String.format("%.3f", ling.luas()));
        System.out.println("Keliling Lingkaran: " + String.format("%.3f", ling.keliling()));
        System.out.println();
        
        BangunDatar seg = new SegiTiga (15,7,"Kuning");
        System.out.println("Warna Segi Tiga: " + seg.getWarna());
        System.out.println("Luas Segi Tiga: " + seg.luas());
        System.out.println("Keliling Segi Tiga: " + seg.keliling());
        System.out.println();
        
        BangunDatar per =new SegiEmpat (10,"Hijau");
        System.out.println("Warna Segi Empat: " + per.getWarna());
        System.out.println("Luas Segi Empat: " + per.luas());
        System.out.println("Keliling Segi Empat: "+per.keliling());
        System.out.println();
    }
}
