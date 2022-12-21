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
class Nilai {
    private String mataKuliah;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;

    public Nilai(String mataKuliah, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
    }
    
    public Nilai(String mataKuliah) {
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = 0;
        this.nilaiUts = 0;
        this.nilaiUas = 0;
    }
    
    public Nilai() {

    }
    
    public String getMataKuliah() {
        return mataKuliah;
    }

    public void setMataKuliah(String mataKuliah) {
        this.mataKuliah = mataKuliah;
    }

    public double getNilaiTugas() {
        return nilaiTugas;
    }

    public void setNilaiTugas(double nilaiTugas) {
        this.nilaiTugas = nilaiTugas;
    }

    public double getNilaiUts() {
        return nilaiUts;
    }

    public void setNilaiUts(double nilaiUts) {
        this.nilaiUts = nilaiUts;
    }

    public double getNilaiUas() {
        return nilaiUas;
    }

    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }
    
    public double hitungNA(){
        return this.nilaiTugas*0.3+this.nilaiUts*0.3+this.nilaiUas*0.4;
    }
    
}
