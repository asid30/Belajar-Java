/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PPP;

/**
 *
 * @author Praktikan
 */
class Nilai {
    private String mataKuliah;
    private double nilaiTugas;
    private double nilaiUts;
    private double nilaiUas;

    public Nilai(){
        this.mataKuliah = null;
        this.nilaiTugas = 0.0;
        this.nilaiUts = 0.0;
        this.nilaiUas = 0.0;
    }

    public Nilai(String mataKuliah){
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = 0.0;
        this.nilaiUts = 0.0;
        this.nilaiUas = 0.0;
    }

    public Nilai(String mataKuliah, double nilaiTugas, double nilaiUts, double nilaiUas) {
        this.mataKuliah = mataKuliah;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
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
        double NA = ((this.nilaiTugas*0.30) + (this.nilaiUts*0.30) + (this.nilaiUas*0.40));
        return NA;
    }

}

class Mahasiswa extends Nilai {
    private String nama;
    private String npm;
    private Nilai nilai;

    public Mahasiswa(){
        this.nama = null;
        this.npm = null;
        this.nilai = null;
    }

    public Mahasiswa(String nama, String npm, Nilai nilai) {
        this.nama = nama;
        this.npm = npm;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNpm() {
        return npm;
    }

    public void setNpm(String npm) {
        this.npm = npm;
    }

    public Nilai getNilai() {
        return nilai;
    }

    public void setNilai(Nilai nilai) {
        this.nilai = nilai;
    }


    public void print(){
        System.out.println("Nama : " + this.nama);
        System.out.println("NPM : " + this.npm);
        System.out.println("Mata Kuliah : " + nilai.getMataKuliah());
        System.out.println("Nilai Tugas : " + nilai.getNilaiTugas());
        System.out.println("Nilai UTS : " + nilai.getNilaiUts());
        System.out.println("Nilai UAS : " + nilai.getNilaiUas());
        System.out.println("Nilai Akhir : " + nilai.hitungNA());
    }
}

public class Contoh {

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