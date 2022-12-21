package Praktikum10;

public class Lingkaran extends BangunDatar {
    private double r;

    public Lingkaran(double r, String warna) {
        super(warna);
        this.r = r;
    }

    public Lingkaran() {
    }
    
    @Override
    public double luas(){
        return Math.PI*r*r;
    }
    
    
    
    @Override
    public double keliling(){
        return 2*Math.PI*r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
