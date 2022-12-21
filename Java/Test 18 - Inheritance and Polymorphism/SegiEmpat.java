package Praktikum10;

public class SegiEmpat extends BangunDatar{
    private double sisi;

    public SegiEmpat(double sisi, String warna) {
        super(warna);
        this.sisi = sisi;
    }

    public SegiEmpat() {
    }

    @Override
    public double luas(){
        return this.sisi*this.sisi;
    }
    
    @Override
    public double keliling(){
        return 4*this.sisi;
    }

    public double getSisi() {
        return sisi;
    }

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }
}
