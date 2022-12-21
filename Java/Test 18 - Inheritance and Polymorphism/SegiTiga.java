package Praktikum10;

public class SegiTiga extends BangunDatar{
    private double alas;
    private double tinggi;

    public SegiTiga(double alas, double tinggi, String warna) {
        super(warna);
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public SegiTiga() {
    }
    
    @Override
    public double luas(){
        return (this.alas*this.tinggi)/2;
    }
    
    @Override
    public double keliling(){
        return 3*this.alas;
    }

    public double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
