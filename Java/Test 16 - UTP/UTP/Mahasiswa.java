package UTP;

class Mahasiswa extends Nilai {
    private String nama;
    private String npm;
    private Nilai nilai;

    public Mahasiswa() {
        
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
        System.out.println("Nama : "+this.nama);
        System.out.println("NPM : "+this.npm);
        System.out.println("Mata Kuliah : "+nilai.getMataKuliah());
        System.out.println("Nilai Tugas : "+nilai.getNilaiTugas());
        System.out.println("Nilai UTS : "+nilai.getNilaiUts());
        System.out.println("Nilai UAS : "+nilai.getNilaiUas());
        System.out.println("Nilai Akhir : "+nilai.hitungNA());
    }

}
