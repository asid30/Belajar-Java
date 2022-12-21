//fungsi this untuk membedakan antara attribut pada class dengan attribut pada parameter method
public class Mahasiswa {
    //atribut
    private String nama;
    private String npm;
    private double nilaiTugas;
    private double nilaiUas;
    private double nilaiUts;
    private double NA;
    
    //constructor
    public Mahasiswa(String nama, String npm) {
        this.nama = nama;
        this.npm = npm;
    }
    public Mahasiswa(String nama, String npm, double nilaiTugas, double nilaiUas, double nilaiUts) {
        this.nama = nama;
        this.npm = npm;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUas = nilaiUas;
        this.nilaiUts = nilaiUts;
    }
    
    //getter
    public String getNama(){
        return this.nama;
    }
    public String getNPM(){
        return this.npm;
    }
    public double getNA(){
        return this.NA;
    }
    public void printData(String jurusan){
        System.out.println("Nama\t\t:"+this.nama);
        System.out.println("NPM\t\t:"+this.npm);
        System.out.println("Jurusan\t\t:"+jurusan);
        System.out.println("Nilai akhir\t:"+NA);
        System.out.println();
    }
    
    //setter
    public void setNama(String nama){
        this.nama=nama;
    }
    public void setNPM(String npm){
        this.npm=npm;
    }
    public void setUTS(int nilaiUts){
        this.nilaiUts=nilaiUts;
    }
    public void setUAS(int nilaiUas){
        this.nilaiUas=nilaiUas;
    }
    
    //usuall method
    public int sumValue(int x, int y){
        return x+y;
    }
    
    //overloading method
    public void hitungNA(){
        this.NA = (this.nilaiTugas*0.3)+(this.nilaiUts*0.35)+(this.nilaiUas*0.35);
    }
    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
        this.NA = (nilaiTugas*0.3)+(nilaiUts*0.35)+(nilaiUas*0.35);
    }
    public void hitungNA(String pesan){
        System.out.println("Nilai Tidak Valid!!");
    }
}
