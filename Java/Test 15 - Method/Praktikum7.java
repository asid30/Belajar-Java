public class Praktikum7 {

    public static void main(String[] args) {
        // TODO code application logic here
        Mahasiswa mhs = new Mahasiswa("Abdilah Asyidiqi","2117051001",88,90,92);
        mhs.hitungNA();
        mhs.printData("Ilmu Komputer");
        
        Mahasiswa mhs2 = new Mahasiswa("Budi Doremi","2117051002");
        mhs2.hitungNA(80,85,88);
        mhs2.printData("Kimia");
        
        Mahasiswa mhs3 = new Mahasiswa("Lomi Damada","2117051003",82,86,88);
        mhs3.hitungNA();
        mhs3.printData("Biologi");
        
        Mahasiswa mhs4 = new Mahasiswa("Ilham Mahaka","2117051004");
        mhs4.hitungNA(84,83,81);
        mhs4.printData("Matematika");
        
        int result = mhs.sumValue(20,60);
        System.out.println("Penjumlahan 1\t:"+result);
        System.out.println("Penjumlahan 2\t:"+mhs.sumValue(10,30));
        System.out.println("Penjumlahan 3\t:"+mhs.sumValue(66,33));
        System.out.println();
        
        
        
    }
    
}
